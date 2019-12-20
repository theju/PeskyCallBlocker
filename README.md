PeskyCallBlocker
----------------

This is a simple android app that hangs up on commercial unsolicited numbers
that start with +9114 (Indian commercial numbers).

This app works only on Android 9 and will implement the `CallScreeningService`
from Android 10 onwards.

Why did I write this?
----------------------

One afternoon (after having watched the GER vs BRA Fifa WC 2014 well after midnight),
I was taking a nap and I received a call offering me a credit card. I politely
declined and drifted back to sleep only to be woken up a few minutes later by a
different person offering the same product! Despite being registered on DND (Do
Not Disturb), I was still receiving these unsolicited calls and wanted to cut
them out.

There are a lot of apps out there that offer this functionality but I wrote up
my own because:
* Most apps asked a myriad of permissions that spooked me.
* I wanted to learn android app development.
* I (everybody to some extent) suffer from the
  [NIH syndrome](https://en.wikipedia.org/wiki/Not_invented_here)

Features
--------

Currently, it recognizes only numbers that start with `+9114` (`+91` being India's
country code and `14` being the prefix for tele-callers).

[TODO] Future development will include a UI to input regexes or the numbers.

Credits
-------

I am grateful to [Imran](https://github.com/imran0101) (awesome android dev, you
should check out his profile) for the help I received while developing this app.

LICENSE
--------

BSD 3-clause license
