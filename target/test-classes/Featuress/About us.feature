Feature: This feature is for validate About us page creation

@Abc
Scenario: Verify About us text is displayed in About us page
Given Launch "<URL>" for demo
When Click About us link
Then Verify About us text is displayed in About us page

@Ab
Scenario: Verify About us video is displayed in About us page
Given Launch "<URL>" for demo
When Click About us link
Then Verify About us video is displayed in About us page

@Ab
Scenario: Verify user able to play About us video
Given Launch "<URL>" for demo
When Click About us link
When Click play video button
Then Verify User is able to watch  About us  video

@Ab
Scenario: Verify user can click close button to close  video
Given Launch "<URL>" for demo
When Click About us link
When Click play video button
When User click on close button
Then Verify user is able to close  About us  video

@Ab
Scenario: Verify user can click close button to close  video
Given Launch "<URL>" for demo
When Click About us link
When Click play video button
When User click on x button
Then Verify user is able to close  About us  video


@Ab
Scenario: Verify user can maximize About us video
Given Launch "<URL>" for demo
When Click About us link
When Click play video button
When User click on Fullscreen button
Then User is able to watch maximized screen video


@Ab
Scenario: Verify user can click on Picture-in-Picture button to watch picture in separate window
Given Launch "<URL>" for demo
When Click About us link
When Click play video button
When User click on PictureinPicture button
Then User is able to watch picture slide in separate window

@Ab
Scenario: Verify user Verify user can mute the audio
Given Launch "<URL>" for demo
When Click About us link
When Click play video button
When User click on mute button
Then User is able to mute audio