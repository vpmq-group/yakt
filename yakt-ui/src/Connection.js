import React, {Component} from 'react';

class Connection extends Component {
    initialState = {
        name: '',
        address: '',
      }

    constructor(props) {
        super(props);
        this.state = { showForm: false };
        this.state = this.initialState
    }

    componentDidMount() {
    }
  
    componentWillUnmount() {
    }

    handleClick() {
        this.setState(state => ({
            showForm: true
        }));

    }

    handleChange = (event) => {
        const {name, value} = event.target
        console.log('значение this:', this);
        console.log('значение name:', name);

        this.setState({
          [name]: value,
        })
      }

      submitForm = () => {
        
        alert('name: ' + this.state.name + ' address: ' + this.state.address);
       // event.preventDefault();
        // <Connection handleSubmit={this.handleSubmit} />
        // this.props.handleSubmit(this.state)
        this.setState({showForm: false})
      }

    render() {
        const self = this
   
        return (
            <div>
                <button type="button" onClick={() => { self.handleClick() }}>
                    Add Connection</button>
                {this.state.showForm &&
                    <form>
                        <label htmlFor="name">Name</label>
                        <input type="text" name="name" id="name" value={self.name} onChange={self.handleChange}/>
                        
                        <label htmlFor="address">Address</label>
                        <input type="text" name="address" id="address" value={self.job} onChange={self.handleChange}/>

                        <input type="button" value="Connect" onClick={self.submitForm} />
                    </form>
                }
            </div>
        )
    }
}



export default Connection