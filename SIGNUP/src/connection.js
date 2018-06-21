var mysql = require('mysql');
var handlers = {};

var conn = mysql.createConnection({
	host: "localhost",
	user: "desi",
	password: "AppProjDB",
	database: "AppProjDB" });

	handlers["/"] = function(req, res) {
		res.writeHead(200, { 'Content-Type' : 'text/html' });
		res.end("<p>Hello World</p><p><a href='/x'>Click me</a></p>");
	}

const server = http.createServer(function(req, res) {
	if(handlers[req.url]) {
		handlers[req.url](req, res);
	}
	else {
		res.writeHead(404);
		res.end("Not found");
	}
});
server.listen(8123);