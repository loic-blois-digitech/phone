import React, {Component} from "react";
import {BrowserRouter as Router, Route} from "react-router-dom";
import Table from "./Components/Table";

class App extends Component {
    render() {
        return (
            <Router>
                <Route exact path="/*" component={Table} />
            </Router>
        );
    }
}

export default App;