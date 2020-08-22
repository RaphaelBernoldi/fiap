var http = require('http');
var app = require('./app/config/express')();

http
    .createServer(app)
	.listen(app.get('port'),function(){
		console.log('Express Server executando na porta ' + app.get('port'));	
})


app.get('/', (req, res) => {
	res.send('Hello World!');
  })

