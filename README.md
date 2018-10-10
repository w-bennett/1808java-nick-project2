# 1808java-nick-project2

OVERVIEW
Make a full-stack web app using Angular, Hibernate, Spring MVC, & RESTful backend. Have meaningful interaction with multiple user types and complex data manipulation. Host on EC2 with Jenkins pipeline for continuous integration. Our goal is to make an open innovation engineering app for economic first principles analysis of products and services. This will help people make things better, cheaper, and faster by getting a quick look at the state of the global economic map with live data.

SPECIFICATIONS

Home Page
Main page with interactive tree graph, expandable nodes of all items in program. Wiki threads and commodities expand when node in tree is clicked. Root nodes of ubiquitous entities like energy and steel will reveal their prices, other info, and wikis. Clicking on a node (which represents a product or service) will open a window with the main wiki article for that item. In the main article will be the rationalization for that item’s scarcity. The article will display the live prices of the supply chain items that result in its price. In this window the user can click to view or participate in the wiki edit discussion thread.

User Rules
Visitors can register for a regular account, and view knowledge tree and threads.
Regular users can write new comments in Edit thread and upvote/downvote other comments to affect their presentation order. Users can have a star awarded by a certified engineer for a useful analytical post. Users’ net upvotes and stars are counted and shown next to username with posts. Users can edit their comments.

Certified engineers can move appropriate Edit thread comments into the corresponding Main wiki article. CEs can award a star to a post. Two CEs can promote a helpful active regular user to a CE. CEs can override the comment ranking system and pin their reply to a comment to show first, in order to increase signal to noise. CEs can edit the data dependencies but need final approval from a GE for the change to take effect.

Global engineers can modify knowledge tree structure by creating and deleting new articles and data links. GEs can delete bad comments. GEs can pin their replies to a comment and rank over CE pinned comments.  Two GEs can promote a CE to GE.

Website Logic

Real time price of commodities fetched from open source APIs and propagate through dependent data. 
Make supply chain of ingredients with live prices update through to consumer goods automatically.
If energy price rises from 7 to 8 cents/kwh, price per kg of aluminum having energy in supply chain should reflect update too.
