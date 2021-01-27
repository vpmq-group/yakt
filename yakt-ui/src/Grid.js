import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import Grid from '@material-ui/core/Grid';
import Paper from '@material-ui/core/Paper';
import RecursiveTreeView from './TreeView';
import Connection from './Connection';

const useStyles = makeStyles((theme) => ({
  gridContainer: {
    flexGrow: 1,
    padding: '1em'
  },
  connectionsTree: {
    'min-width': '300px'
  },
  paper: {
    padding: theme.spacing(2),
  }
}));

export default function SpacingGrid() {
  const classes = useStyles();

  return (
    <div className={classes.gridContainer}>
      <Grid container spacing={3}>
        <Grid item xs={3} className={classes.connectionsTree}>
          <Paper className={classes.paper}>
            <Connection/>
            <RecursiveTreeView/>
          </Paper>
        </Grid>
        <Grid item xs>
          <Paper className={classes.paper}> 
            <RecursiveTreeView/>
          </Paper>
        </Grid>
      </Grid>  
    </div>
  );
}
