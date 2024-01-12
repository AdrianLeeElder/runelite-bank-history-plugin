This repository is not in use please go to https://github.com/Adam-/runelite-plugins/tree/bank-value-tracker to make changes to this plugin
# runelite-bank-history-plugin
A runelite plugin for showing bank value over time. It's currently in the alpha stage, so please feel free to request features/report bugs in Github's issue tracker.

Please consider [buying me a coffee](https://www.buymeacoffee.com/c4dSqRC) if you enjoy the plugin c:, thank you.

### Features (1.0-SNAPSHOT)
- Track multiple accounts (drop down for changing account).
- Graph of bank value over time.
- Simple time range selection (All, Today, Past 24 hours, Last week, etc.).
- Advanced time selection (Date/time).
- Panel in right-hand view can be expanded in a new window.

### TODO:
- ~~Allow tracking of individual tabs.~~
- ~~Select data for a specific tab~~
- ~~Allow customizing when data is stored. It currently happens each time you open
    the bank which isn't ideal.~~
- Allow values to be displayed in the y-axis as their formatted values (e.g 32.23m).
- Add user feedback when adding a new data entry/pressing refresh button
- Switch selected bank tab automatically based on current bank tab (toggle by setting).

### Images (1.0-SNAPSHOT)
![Feature 5](https://raw.githubusercontent.com/AdrianLeeElder/runelite-bank-history-plugin/master/images/image5.JPG)
![Feature 6](https://raw.githubusercontent.com/AdrianLeeElder/runelite-bank-history-plugin/master/images/image6.JPG)

### Build instructions

1. Install [IntellIJ](https://www.jetbrains.com/idea/) and open this project in the editor.

2. Upon opening, the gradle project build automatically. You can always trigger a build
   by using `Build > Build Project` command.

3. Configure the client to run with the `-ea` open under `VM Options`. 
    - Go to `Run > Edit Configurations`.
    - Under `Application` you should see a target for `com.adriansoftware.ExamplePluginTest`. Click on it.
    - Look for the `Modify Options...` drop-down button and click on it.
    - In the drop-down menu list, click on `Add VM Options`. This will add the VM Options text box to the page.
    - In the new text box for `VM Options`, add the following flag: `-ea`.

4. Run the project using the `Run > Run...` command. If asked which configuration to run, select
   `com.adriansoftware.ExamplePluginTest`.
