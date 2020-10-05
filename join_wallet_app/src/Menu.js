import React, { Component } from 'react';

import { createDrawerNavigator } from '@react-navigation/drawer';
import { NavigationContainer } from '@react-navigation/native';
import Login from './components/Login';
import ViewOutside from './components/ViewOutside';

const Drawer = createDrawerNavigator();

const home = () => <ViewOutside />
const login = () => <Login />


export default class Menu extends Component {
    

    render(){
        return (
            <NavigationContainer>
              <Drawer.Navigator>
                <Drawer.Screen name="Welcome" component={home} />
                <Drawer.Screen name="Login" component={login} />
              </Drawer.Navigator>
            </NavigationContainer>
          );
    }
}