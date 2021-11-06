import Dashboard from 'pages/Dashboard';
import Home from 'pages/Home';
import { BrowserRouter, Route, Switch } from 'react-router-dom';

const Routes = () => {
    return (
        <div >
            <BrowserRouter>
                <Switch>
                    <Route path="/" exact>
                        <Home />
                    </Route>
                </Switch>
                <Route path="/dashboard">
                    <Dashboard />
                </Route>
            </BrowserRouter>
        </div>
    );
}

export default Routes;
