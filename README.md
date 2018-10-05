# 1808java-nick-project2

OVERVIEW

Make a full-stack web app using Angular, Hibernate, Spring MVC, & RESTful backend. 
Have meaningful interaction with multiple user types and complex data manipulation. 
Host on EC2 with Jenkins pipeline for continuous integration.

GOALS

Make an open innovation engineering app for economic first principles analysis of 
products and services. Help people make things better, cheaper, and faster by getting 
a quick look at the state of the global economic map with live data.

SPECIFICATIONS

Home Page

Main page with interactive tree graph, expandable nodes of all items in program. 
Wiki threads and commodities expand when node in tree is clicked. Root nodes of 
ubiquitous entities like energy and steel will reveal their prices, other info, and wikis. 

User Rules

Regular users have ability to write new comments in wiki Edit thread and upvote/downvote 
on other comments. Users can have a star awarded by a certified engineer for a well 
reasoned, useful analytical post. Users’ net upvotes also counted and shown next to 
username with posts. 

Certified engineers have privilege to approve incorporation of fully debated Edit thread 
comments into Main item-node wiki. Cert engineers can award a star to a post and user.

Global engineers can modify knowledge tree structure by creating and deleting new 
nodes and data links. 

Website Logic

Real time price of commodities fetched from open source APIs and propagate 
through dependent data. Make supply chain of ingredients with live prices update 
through to consumer goods automatically. If energy price rises from 
7 to 8 cents/kwh, price per kg of aluminum having energy in supply chain 
should reflect update too.
