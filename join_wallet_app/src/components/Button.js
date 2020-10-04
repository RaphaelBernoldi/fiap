import React from 'react'
import { TouchableHighlight, Text, StyleSheet } from 'react-native'


const styles = StyleSheet.create({
    button: {
        fontSize: 20,
        borderRadius: 5,
        height: 30,
        width: 200,
        backgroundColor: '#0000FF',
        textAlign: 'center',
        borderColor: '#888'
    },
})
export default props => {
    const stylesButton =[styles.button]
   
    return (<TouchableHighlight>
                <Text style={stylesButton}>
                    {props.label}
                </Text>
            </TouchableHighlight>
    )
}