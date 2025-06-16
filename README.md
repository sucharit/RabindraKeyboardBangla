This is a phonetic keyboard for typing Bengali on Android devices.

========

This code is covered under GNU GPLv3; for details, see the file LICENSE. In summary, you may inspect, modify, and redistribute the code at your free will, as long as you include your source files and preserve the original copyright notices.

Copyright (C) 2025 Sucharit Sarkar. 

Contact: sucharit@math.ucla.edu


========

Installation:

Method 1. Directly from the binary file.

Enable installation from "Unknown sources" on your Android device. (You might need to make yourself a "Developer" for your device first.)

Download the binary file app/release/app-release.apk to your Android device, and click to install it.

You will receive several warnings about the app being from an unknown source. You have to ignore all of those warnings.

Even after installation, there will be a warning that the Keyboard can store your keypresses; that is a standard Android warning. This keyboard does not store any information.

Method 2. From the source.

Install Android Studio on your computer.

Download the source from the github repository (or simply git clone the repository) and open it in Android Studio.

(Optional) Inspect or modify the source to suit your need.

Make yourself a "Developer" for your device, enable "Debugging via USB", connect device to computer via USB, and using Android Studio, install the package to your device through Android Studio.

Note: If you have an older version of the App already installed, the above procedures should overwrite that installation. However, if there are issues, uninstall the older version first before installing. When uninstalling, use the option of "Uninstall for all users".

========

Activation:

You need to activate the keyboard by going to "Language and Settings" on your Android device and adding this new keyboard. Once added, any time a text input box appears, there will be a small keyboard sign to the bottom right of your keyboard, which will allow you to switch between the default Android keyboard and this new keyboard.

========

Phonetics:

The keymapping is fairly natural (with some additional shortcuts). The following are some of the features.

--অ is represented by a, not o. Therefore, আ is represented by aa, and ও is represented by o. 

--ঋ is represented by Ri. 

--For the longer sounds, type twice, i.e., aa or A for আ, ii for ঈ, uu for ঊ, and RiRi for ৠ (only used in Sanskrit words); typing oo and ee in the middle of a word converts them to োঽ and েঽ, respectively (also only used in Sanskrit words). 

--For অ্যা and এ্যা type aA and eA. 

--For the aspirated sounds, use h, eg. kh for খ, gh for ঘ, etc; additional h-presses do not change the letter; ফ is ph and ভ is bh. 

--For the harder/longer sounds, type in capitals, e.g. T for ট, Th for ঠ, D for ড, N for ণ, R for ড়, J for য. 

--ঙ is Ng, ঞ is Nj. 

--ng is encoded as ং if followed by a consonant, otherwise as ঙ্গ. 

--শ, স¸ and ষ are sh, s and S (or Sh), respectively. 

--For hasanta, use ` 

--ব is encoded both as b and as w. 

--y encodes য়, except when it follows a constant, when it encodes য-ফলা. Some special cases are when ry which is র‍্য (for র্য type rJ) and gyy which is জ্ঞ (ordinary gy is still গ্য). 

--For juktakkhors, type the consecutive consonants. For example, ndr for ন্দ্র, kt for ক্ত, shr for শ্র.  Therefore, ব-ফলা is w, র-ফলা is r, য-ফলা is y. 

--Some juktakkhors have shortcuts (like gyy for জ্ঞ and gy for গ্য). Some extra ones are nj for ঞ্জ, x for ক্ষ (the usual method to enter ক্ষ would have kS). I will leave the rest to you to discover for yourself. 

--ঃ is represented by H; for ঁ, use ñ. Both have to be used after a vowel; if used after a consonant, does nothing. 

--It is often useful to disrupt the phonetic transliteration; use #. For example, to type করতে, type kar#te; if you type karte, you get কর্তে; you may also type karate to get করতে, although that is a bit unnatural. This is also needed to write certain combinations. For instance, to write ওই, type o#i, since oi converts to ঐ; to write সিংহ, type sing#ha, since singha converts to সিঙ্ঘ. To completely disrupt the phonetic transliteration, type # twice, but this is not recommended; for instance, if you type kar##te, you get কর⁠তে, where the shape of ে is wrong. 

--To type some strange juktakkhors, you need to type the hasanta explicitly. For example, for ক্হ, type kh, since kh is খ.

--For । use . and for ॥ use .. and for ; use ,,

--DONE is Enter, BKSP is Backspace.

========

Examples:

--বাংলা baanglaa

--রবীন্দ্র rabiindra 

--তৎক্ষণাৎ tatxaNaat 

--নমোঽস্তুতে namoostute 

--হ্যাঁ hyaañ 

--তত্ত্বালোচনা tattwaalochanaa 

--জিজ্ঞাসা jigyyaasaa 

--ভাগ্য bhaagya 

--পরেদ্যবি paredyabi 

--সন্ধ্যার্ঘ্য sandhyaarghya 

--কলকাতা kal#kaataa
