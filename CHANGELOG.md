# 4.7.0
- Android 13 Support
- Flutter 3 Support (Fix #58)
- Make FlutterContactPicker constructor internal (Fix #55)
# 4.6.0

- Update to Android 12
- Update to Kotlin 1.6
- Update to web & interface `4.6.0`

# 4.5.0

- Update to Kotlin 1.5.10
- Update to Gradle 7
- Update Android Gradle plugin
- Fix NPEs when certain values in contacts are null on Android (Fix #35)
- fix when map['photo'] is null (#31 by @daniloadorno)
- Support Custom Relations [Android] (#34 by alkebuware)

# 4.4.0

- Fix pickEmailContact never completes if pressing BACK on Android bug (#29)

# 4.3.3
- Fix pickEmailContact never completes if pressing BACK on Android bug (#29)

# 4.3.1
- Fix SDK constraints

# 4.3.0
- Make Nullsafety the default
- Fix `java.lang.NullPointerException when calling pickFullContact()` (#22)

# 4.3.0-nullsafety.5

- First null safety release for 4.x

# 4.2.1

### Web fixes

- Run dartfmt

# 4.2.0

### Interface fixes

- Improve documentation

### Web fixes

- Update documentation
- Better catch edgecases
- Improve Exception description

# 4.1.0

- Fix web support issues

# 4.0.2

- Run dartfmt

# 4.0.1

- Fix sdk constraints
- Fix build errors on mobile

# 4.0.0

- Support web (Massive thanks to @Niggelgame for making this possible)

# 3.2.0-nullsafety.2

- Fix dependency problem
- Upgrade version

# 3.1.1-nullsafety.1

- Fix some issues with nulla safety

# 3.1.1-nullsafety.0

- Add nullsafety

# 3.1.1

- Fix crash on xiaomi (#12)
- Update Kotlin to 1.4.20
- Update Gradle to 6.7.1

# 3.1.0

- Add Support for more types in Full Contact
  - Note
  - Company
  - SIP
  - Relations
  - Custom fields (Google Contacts app only)
- Add Kotlin 1.4.0 Note to README
- Fix hashCode(), ==() and toString() implementations to reflect new properties

## 3.0.1

- Fix iOS issue (#6)

## 3.0.0

- Update Library code
- Add Support for profile pictures

## 2.4.3

- Fix contacts not being returned on v1 embedding

## 2.4.2

- Reformat code

## 2.4.1

- Fix type in fluttercontactpicker.dart
- Fix SDK constraints

## 2.4.0

- Provide API to fetch whole contact
- Make picker Android 11 ready

## 2.3.2

- Fix legacy implementation

## 2.3.1

- Fix plugin handling every intent

## 2.3.0

- Fix activity listeners (#1)

## 2.2.1

- Fix crash when canceling pick on android

## 2.2.0

- Fix bug preventing more than one contact request
- Fix example
- Upgrade example
- Remove some example code

## 2.1.2

- Fix iOS implementation

## 2.1.1

- Remove debug messages

## 2.1.0

- Migrate to Flutter v2 embedded plugins
- Remove example plugin code
- Support multiple requests at the same time (only recommended for v2 plugins)

## 2.0.0

- Rewrite fork with kotlin and swift
- Add support for email contacts
