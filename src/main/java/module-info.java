open module kafkademo {
	requires spring.boot.autoconfigure;
	requires spring.context;
	requires spring.boot;
	requires spring.web;
	requires spring.core;
	requires spring.beans;
	requires org.slf4j;
	requires java.net.http;
	requires spring.kafka;
	requires kafka.clients;
	requires java.instrument;
	requires spring.messaging;
}
