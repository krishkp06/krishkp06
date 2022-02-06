Feature: checking whether order id is generating or not

Scenario Outline: checking whether order id is generating or not
Given user is on adactin home page
When User enters "<username>" and "<password>"
And clcks login
When user searchs hotels
And click search hotel
When user select hotel
And click select hotel
When user makes payment
Then orderid id generated

Examples:
	|username|password|
|krishnaprasath783|8LRI21|
|krishnaprasath783|8LRI21|
|krishnaprasath783|8LRI21|
|krishnaprasath783|8LRI21|
|krishnaprasath783|8LRI21|
|krishnaprasath783|8LRI21|
|krishnaprasath783|8LRI21|
|krishnaprasath783|8LRI21|
|krishnaprasath783|8LRI21|
|krishnaprasath783|8LRI21|
|krishnaprasath783|8LRI21|
|krishnaprasath783|8LRI21|
|krishnaprasath783|8LRI21|
|krishnaprasath783|8LRI21|

