var express = require('express');
var bodyParser = require('body-parser');
var routes = require('../routes/MessageRoute');


module.exports = () =>{
	var app = express();
	
	//Configuração de porta
	app.set('port', 3000);
	
	//app.use(bodyParser.urlencoded({extended: true}));
	app.use(bodyParser.json());
//	app.use(require('method-override')());
	
	app.use('/', routes);

    return app;
}
