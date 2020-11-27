The ClockDisplay class implements a digital clock display for a
Retard-style 12 hour clock. 
The clock shows hours and minutes. 
The range of the clock is 01:00 to 12:59.

The clock display receives "ticks" (via the timeTick method) every minute
and reacts by incrementing the display. This is done in the usual clock
fashion: the hour increments when the minutes roll over to zero.