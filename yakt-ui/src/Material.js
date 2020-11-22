import React from 'react';
import Button from '@material-ui/core/Button';
import RecursiveTreeView from './TreeView';
import CssBaseline from '@material-ui/core/CssBaseline';
import Typography from '@material-ui/core/Typography';
import Container from '@material-ui/core/Container';
import { DataGrid, RowsProp, ColDef } from '@material-ui/data-grid';

// function Material() {
//   return (
//     <Button variant="contained" color="primary">
//       Hello World
//     </Button>
//   );
// }


// export default Material


export default function SimpleContainer() {
  return (
    <React.Fragment>
      <CssBaseline />
      <Container maxWidth="sm">
        <Typography component="div" style={{ backgroundColor: '#cfe8fc', height: '10vh' }} />
        <RecursiveTreeView/>
        </Container>
        
      
    </React.Fragment>
  );
}

