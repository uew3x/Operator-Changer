# Operator Changer 📱

**Operator Changer** (`com.worswex.opchange`) is an Android application designed to easily change the displayed carrier name in the status bar and notification shade[cite: 3].

Built using **Jetpack Compose** and Android system properties[cite: 3].

---

## ⚡ Features

* ✏️ **Custom Carrier Name:** Set any custom text to replace your default carrier name[cite: 3].
* 🚀 **Jetpack Compose UI:** Modern and smooth interface powered by Material 3[cite: 3].
* 🔒 **Root Check:** Automatic detection and handling of root privileges using `libsu`[cite: 3].

---

## 🛠 Requirements

* **Android:** 8.0+
* **Root Access:** Magisk or KernelSU (required to modify `gsm.operator.alpha` system properties)[cite: 3].

---

## 🚀 How to Use

1. Download and install the APK from the **Releases** section.
2. Open the app and tap **Grant Root Access** to grant superuser permissions in Magisk or KernelSU[cite: 3].
3. Enter your desired operator name in the **New Operator Label** field[cite: 3].
4. Tap **Apply New Name**[cite: 3].

---

## 💻 Tech Stack

* **Language:** Kotlin
* **UI Framework:** Jetpack Compose (Material 3)[cite: 3]
* **Root Engine:** [libsu](https://github.com/topjohnwu/libsu) by topjohnwu[cite: 3]
