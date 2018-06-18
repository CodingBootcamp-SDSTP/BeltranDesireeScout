const http = require('http');
var handlers = {};

handlers["/"] = function(req, res) {
	res.writeHead(200, { 'Content-Type' : 'text/html' });
	res.end("<p>Hello World</p><p><a href='/x'>Click me</a></p>");
}

handlers["/login"] = function(req, res) {
	res.writeHead(200, { 'Content-Type' : 'text/html' });
	res.end("<p>Hello World</p><p><a href='/x'>Click me</a></p>");
}

handlers["/signup"] = function(req, res) {
	res.writeHead(200, { 'Content-Type' : 'text/html' });
	res.end("<p>Hello World</p><p><a href='/x'>Click me</a></p>");
}

handlers["/events"] = function(req, res) {
	res.writeHead(200, { 'Content-Type' : 'text/html' });
	res.end("<p>Hello World</p><p><a href='/x'>Click me</a></p>");
}

handlers["/guidelines"] = function(req, res) {
	// get guidelines(camper survival and rules) from text file
	res.writeHead(200, { 'Content-Type' : 'text/html' });
	res.end("<p>Hello World</p><p><a href='/x'>Click me</a></p>");
}

handlers["/about"] = function(req, res) {
	res.writeHead(200, { 'Content-Type' : 'text/html' });
	res.end("<p>Hello World</p><p><a href='/x'>Click me</a></p>");
}

handlers["/donate"] = function(req, res) {
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
