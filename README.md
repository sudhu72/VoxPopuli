# VoxPopuli
      Eclipse Plugin to Voice Enable IDE Features

This is an Eclipse Plugin project to aid Java programmers who find using the keyboard a challenge. 

Eclipse IDE has many hot keys to increase programmer productivity. But programmers with disability find it difficult to avail this facility. 

For instance, the hot key for "Incremental Find Reverse" is Ctrl+Shift+J. Some form of disability makes it difficult to press multiple keys together on a keyboard.

This plugin intends to voice enable most (possibly all) Eclipse features/hot keys. The voice library being used is CMUSphinx.

Voice API can be enhanced by generating the required dictionary (.dic) and language model (.lm) files at: http://www.speech.cs.cmu.edu/tools/lmtool-new.html. The input for this step is a text file like the dictionary file.

Dictionary and other eclipse features/hot keys info files are in the documents directory.

Plugin jar creation needs Eclipse IDE for now. A build script will be provided soon.

The voice listener can be initialized from the menu - VoxPopuli->Start Listening. The trigger word for voice commands start with 'vox'.

VoxPopuli will stop listening with the voice command - "Vox Stop Listening".

This project intends to increase productivity of programmers who cannot use the keyboard effectively. 
