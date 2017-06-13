Feature: Calculating the volume of a sphere
	Scenario Outline: Calculating without input errors
		Given a sphere of radius <radius>
		Then when the program VolumeSphere is run
		Then the total volume should be close to <volume>
	
	Examples:
	|	radius	|	volume		|
	|	0		|	0.0			|
	|	2		|	33.4933		|
	|	10		|	4186.6666	|
	