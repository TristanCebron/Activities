# Activities – Android App

An Android application developed in **Java** using **Android Studio**. The app demonstrates how to work with multiple activities, navigate between screens, transfer data using Intents, and implement swipe gestures.

## Features

- **Three Activities:** Navigate between MainActivity, HelloActivity, and ThirdActivity.
- **Counter:** Increase a counter by pressing the COUNT button.
- **Data Transfer:** Pass the current counter value between activities using `Intent.putExtra()` and `getIntExtra()`.
- **Button Navigation:** Switch between activities using buttons.
- **Swipe Navigation:** Swipe left or right on the third screen to navigate between activities.
- **Counter Persistence:** Maintain the counter value when navigating between screens.

## Activities

### 1. MainActivity
- Displays the current counter value.
- Contains a COUNT button to increase the counter.
- Provides buttons to open HelloActivity and ThirdActivity.

### 2. HelloActivity
- Displays a "Hello!" message.
- Shows the counter value received from MainActivity.
- Contains a button to return to MainActivity.

### 3. ThirdActivity
- Displays the current counter value.
- Provides buttons to navigate to MainActivity and HelloActivity.
- Supports swipe gestures:
  - **Swipe Left:** Opens MainActivity.
  - **Swipe Right:** Opens HelloActivity.

## Technologies Used

- **Java** – Application logic
- **XML** – User interface layouts
- **Android Studio** – Development environment
- **Android SDK** – Android development tools
- **ConstraintLayout** – User interface positioning
- **GestureDetector** – Swipe gesture detection
- **Intent** – Navigation and data transfer

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/TristanCebron/Activities.git
   ```
2. Open **Android Studio**.
3. Select **Open** and choose the cloned project folder.
4. Wait for Gradle synchronization to finish.
5. Run the application on an Android emulator or physical Android device.

## Project Structure

```text
app/src/main/
├── java/com/example/activities/
│   ├── MainActivity.java
│   ├── HelloActivity.java
│   ├── ThirdActivity.java
│   └── OnSwipeTouchListener.java
├── res/layout/
│   ├── activity_main.xml
│   ├── activity_hello.xml
│   └── activity_third.xml
└── AndroidManifest.xml
```

## How It Works

The application uses explicit Intents to navigate between activities and transfer the counter value.

**Sending data:**
```java
Intent intent = new Intent(this, HelloActivity.class);
intent.putExtra("stevec", stevec);
startActivity(intent);
```

**Receiving data:**
```java
int stevec = getIntent().getIntExtra("stevec", 0);
```

Swipe gestures are handled by a custom `OnSwipeTouchListener` class using Android's `GestureDetector`.

## Author

**Tristan Čebron**

GitHub: [@TristanCebron](https://github.com/TristanCebron)
