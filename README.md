# Selenium-WebDriver-with-Java
#Introduction
Webdriver:(Selenium 2.0)
This brand new automation tool provides all sorts of features, including a more cohesive and object oriented API as well as an answer to the limitations of the old implementation.It supports the WebDriver API  underlying technology,along with the Selenium underlying technology,
The architecture of Selenium Webdriver is entirely different from RC.Unlike RC there is no proxy server betweenAUT and Code.
It makes direct calls to browser native API to get the things executed.Unlike RC it does not Use any proxy server to talk to browser. WebDriver uses the most appropriate way to access the browser API. If we look at Firefox, it uses JavaScript to access the API. If we look at Internet Explorer, it uses C++. That means that it sometimes needs direct help from browser development team,By this approach we can control browsers in the best possible way but has the downside that new browsers entering the market will not be supported straight away like we can with RC
As Webdriver directly talks with browser we can overcome the limitations of JavaScript security model which we have face with Selenium Core in RC
Selenium-WebDriver supports the following browsers along with the operating systems these browsers
are compatible with.
• Google Chrome 12.0.712.0+
• Internet Explorer 6, 7, 8, 9 - 32 and 64-bit where applicable
• Firefox 3.0, 3.5, 3.6, 4.0, 5.0, 6, 7
• Opera 11.5+
• HtmlUnit 2.9
• Android – 2.3+ for phones and tablets (devices & emulators)
• iOS 3+ for phones (devices & emulators) and 3.2+ for tablets (devices & emulators)
Languages on which Webdriver Supports:Java, Javascript, Ruby, PHP, Python, Perl, C#
You can use any of the above language to Automate application.
In addition, Selenium 2 still runs Selenium 1’s Selenium RC interface for backwards compatibility.
No server required to start.
No support for Android and Iphone platform in RC
Can Handle rich API 
Can handle Mouse movements
It directly talks to browser. unlike RC it does not use any proxy server
It supports all the Latest Versions of Firefox
All future enhancements can be done in Webdriver only.

#Content:
1. Basics:
**Different WebDriver methods
**How to invoke different browsers using WebDriver.

2. Different Locators Techniques and tools used: 
**Firebug and Firepath Add-ons
**Element identification by different locating mechanism
**Advance ways of locating webelement\objects. Writing customized xpath and cssselector

3. Techniques to automate web UI:
**Handling Dropdown/Select element
**Handling checkboxes, radiobuttons
**Handling Javascript Alert
**WebElement validation techniques

4. Techniques to Automate advanced WebUI
**Handling Ajax/Mouse interaction
**Handling window, multiple windows
**Handling Frames

5. Cross Browser Testing with Selenium Grid

6. Data Driven Testing

7. Synchronization : Implicit Wait and Explicit Wait.



