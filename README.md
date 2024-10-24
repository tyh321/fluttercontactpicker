# fluttercontactpicker
[![pub.dev](https://img.shields.io/badge/pub-4.4.0-green.svg)](https://pub.dev/packages/fluttercontactpicker#-readme-tab-)

Interact with native OS contact pickers using Flutter

**Note:** This plugin requires at least Kotlin 1.4.0 to compile

Web demo: https://fcp.mik.wtf/

## Contents
- [Getting Started](#getting-started)
- [Features](#features)
- [Permissions](#permissions)


## Getting Started
Grab contact.
```dart
final PhoneContact contact =
    await FlutterContactPicker.pickPhoneContact();
```

For more info read the docs or take a look at the example

## Features
- Pick a phone/email contact using the OSs native contact picker
- Pick a Full contact (except iOS)
- Support Flutter Web

## Permissions
If you target Android 11+ (API 30+) you need to obtain the `android.permission.READ_CONTACTS` permission, which is declared as a library permission [here](https://github.com/DRSchlaubi/contact_picker/blob/master/android/src/main/AndroidManifest.xml#L3) this permission will be requested automatically if the `askForPermission` parameter is true.

Alternatively you can request the permission manually with [FlutterContactPicker.requestPermission()](https://pub.dev/documentation/fluttercontactpicker/latest/fluttercontactpicker/FlutterContactPicker/requestPermission.html) or check with [FlutterContactPicker.hasPermission()](https://pub.dev/documentation/fluttercontactpicker/latest/fluttercontactpicker/FlutterContactPicker/hasPermission.html)

## Obtain Full Contact (Android Only)
**Note:** Unlike Android iOS does not offer a way to directly get a full contact from the ContactPicker therefore this library does not support it. Apple might add it in 2030 so stay tuned

```dart
final FullContact contact =
    await FlutterContactPicker.pickFullContact();
```

### Obtain profile picture
The FullContact class has a `photo` property if the picked contact has an avatar. You can use the `asWidget()` method to get a renderable `Image` widget.


Full documentation: https://pub.dev/documentation/fluttercontactpicker/latest/fluttercontactpicker/fluttercontactpicker-library.html

### Web support
This plugin also supports the [Web Contact Picker API](https://web.dev/contact-picker/).