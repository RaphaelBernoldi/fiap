import React, { Component } from 'react';
import { Image, View, StyleSheet, Button } from 'react-native';

const styles = StyleSheet.create({
    logoWelcome: {
        width: 200,
        height: 200,
    }
})

export default class Welcome extends Component {



      render(){
          return (
            <View>
                <Image
                    style={styles.logoWelcome}
                    source={require('../assets/icons/artwark-guy-holding-paper.png')}></Image>
            </View>
          )
      }
}