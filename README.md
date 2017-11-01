PeskyCallBlocker
----------------

This is a simple android app that hangs up on commercial and unsolicited numbers.
This app is not required if you use Android 7.0 and above.

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

Copyright (c) 2014, Thejaswi Puthraya
All rights reserved.

Redistribution and use in source and binary forms, with or without modification,
are permitted provided that the following conditions are met:

1. Redistributions of source code must retain the above copyright notice, this
   list of conditions and the following disclaimer.

2. Redistributions in binary form must reproduce the above copyright notice,
   this list of conditions and the following disclaimer in the documentation
   and/or other materials provided with the distribution.

3. Neither the name of the copyright holder nor the names of its contributors
   may be used to endorse or promote products derived from this software without
   specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY
OF SUCH DAMAGE.
