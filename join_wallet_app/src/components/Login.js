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
        justifyContent: 'center',
        backgroundColor: '#997E33'

    },
    content:{
        flex: 6,
        flexDirection: 'column',
        alignItems: 'center',
        justifyContent: 'space-between',
    },
    footer: {
        flex: 1,
        alignItems: 'center',
        justifyContent: 'center'
    },
    logo: {
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
                    style={styles.logo}
                    source={require('../assets/icons/artwork-woman-pointing.png') }></Image>
                <TextInput
                    style={{ height: 40, borderColor: 'gray'}}
                    onChangeText={text => onChangeText(text)}
                    value={value}
                    />
                <TextInput
                    style={{ height: 40, borderColor: 'gray'}}
                    onChangeText={text => onChangeText(text)}
                    value={value}
                    />
                <Button label='Entrar'/>
            </View>
            <View style={styles.footer}>
            </View>
        </View>
    )
}