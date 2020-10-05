import React from 'react';
import {View, StyleSheet, Image} from 'react-native';
import Button from '../components/Button';



const styles = StyleSheet.create({
    container: {
        height: '100%',
        backgroundColor: '#FFFFFF'
    },
    header: {
        flex: 1,
        alignItems: 'center',
        justifyContent: 'center'
    },
    content:{
        flex: 3,
        flexDirection: 'column',
        alignItems: 'center',
        justifyContent: 'space-between',
    },
    footer: {
        flex: 1,
        alignItems: 'center',
        justifyContent: 'center'
    },
    logoWelcome: {
        width: 200,
        height: 200,
    },
   
})


export default () => {
    
    return (
        
        <View style={styles.container}>
            <View style={styles.header}>
            </View>
            <View style={styles.content}>
                
                <Image
                    style={styles.logoWelcome}
                    source={require('../assets/icons/artwark-guy-holding-paper.png')}></Image>
                <Button label='Entrar'/>
                <Button label='Cadastrar' />


            </View>
            <View style={styles.footer}>
            </View>
        </View>
    )
}