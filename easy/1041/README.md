## Intuition
Let chopper help explain.
(Chopper from one piece, will let him go if illegal)

Starting at the origin and face north ```(0,1)```,
after one sequence of `instructions`,

1. if chopper return to the origin, he's in an obvious circle.
2. if chopper finishes with face not towards north,
it will get back to the initial status in another one or three sequences.

## Explanation
`(x,y)` is the location of chopper.
`d[i]` is the direction he is facing.
`i = (i + 1) % 4` will turn right
`i = (i + 3) % 4` will turn left
Check the final status after `instructions`.


## Complexity
Time `O(N)`
Space `O(1)`
