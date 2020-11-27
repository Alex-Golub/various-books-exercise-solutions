The ClockDisplay class implements a digital clock display for a
European-style 24 hour clock. 
The clock shows hours and minutes. 
The range of the clock is 00:00 (midnight) to 23:59 (one minute before midnight).

The clock display receives "ticks" (via the timeTick method) every minute
and reacts by incrementing the display. This is done in the usual clock
fashion: the hour increments when the minutes roll over to zero.