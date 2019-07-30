import React, { Component } from 'react';
//import './Login.css';

class Login extends Component {
	render() {
		return (
			<div>
			<div class="form-group">
				<label for="user">Usuário</label>
				<input type="text" class="form-control" id="user" aria-describedby="user" placeholder="Digite seu usuário"/>
 			</div>
			<div class="form-group">
				<label for="password">Senha</label>
				<input type="password" class="form-control" id="password" placeholder="Digite sua senha"/>
 			</div>
			<button type="submit" class="btn btn-primary">Logar</button>
			</div>
						);
					  }
					}
					
export default Login;
					
