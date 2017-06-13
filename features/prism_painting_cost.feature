Feature: Calculating the cost of painting multiple prisms with the same dimensions
	Scenario Outline: Calculating without input errors
		Given a number of spheres <ns>, each of dimension <length>, <width>, and <height>
		Then when the program Estimate_Prism is run
		Then the total cost to paint them should be close to <cost>
	
	Examples:
	|	ns	|	length	|	width	|	height	|	cost	|
	|	1	|	5		|	6		|	7		|	353.10	|
	|	5	|	2		|	5		|	7		|	973.50	|
	|	10	|	2		|	6		|	3		|	1188.00	|
	