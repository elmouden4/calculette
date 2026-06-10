# 🚀 Instructions de démarrage rapide

## ⚡ Démarrage en 5 minutes

### 1. Cloner le projet

```bash
git clone https://github.com/elmouden4/calculette.git
cd seance2
```

### 2. Ouvrir dans Android Studio

- Lancez Android Studio
- File → Open → Sélectionnez le dossier `calculette`
- Attendez la synchronisation Gradle

### 3. Compiler et exécuter

- Appuyez sur **Maj+F10** (ou Run → Run 'app')
- Sélectionnez l'émulateur ou le téléphone
- L'application se lance !

---

## 🎮 Utiliser l'application

### Calculette

1. Entrez deux nombres dans les champs
2. Cliquez sur l'opération désirée (+, -, ×, ÷)
3. Voyez le résultat s'afficher
4. Pour une autre opération, répétez

### Devinette

1. L'application génère un nombre aléatoire (1-100)
2. Entrez votre nombre deviné
3. Cliquez sur "OK"
4. Lisez l'indice (trop petit/grand)
5. Continuez jusqu'à trouver ou dépasser 5 tentatives
6. Cliquez "Recommencer" pour rejouer

---

## 🛠 Configuration

### Prérequis minimums

- **Android Studio** : 2021.1 ou supérieur
- **Java** : JDK 11 ou supérieur
- **Android SDK** : API 21+ (obligatoire), API 33+ (recommandé)
- **Gradle** : 7.0+ (géré automatiquement)

### Vérifier la configuration

```bash
# Vérifier Java
java -version

# Vérifier Gradle
./gradlew --version
```

### Variables d'environnement (si nécessaire)

```bash
# Sur Windows
set JAVA_HOME=C:\Program Files\Java\jdk-11

# Sur macOS/Linux
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-11.jdk/Contents/Home
```

---

## 🐛 Erreurs courantes et solutions

### Erreur : "SDK location not found"

**Solution :**
1. Android Studio détecte le SDK automatiquement
2. Si pas automatique : File → Project Structure → SDK Location
3. Sélectionnez le chemin vers votre Android SDK

### Erreur : "Gradle sync failed"

**Solution :**
```bash
./gradlew clean
./gradlew build
```

### Erreur : "package R does not exist"

**Solution :**
1. Build → Clean Project
2. Build → Rebuild Project
3. Si toujours une erreur, lisez [GUIDE_FIX_R_DOES_NOT_EXIST.md](docs/GUIDE_FIX_R_DOES_NOT_EXIST.md)

### Application crash au lancement

**Vérification :**
1. Ouvrez Logcat (View → Tool Windows → Logcat)
2. Cherchez l'erreur en rouge
3. Lisez le message d'erreur complet
4. Consultez le [GUIDE_IMPLEMENTATION.md](docs/GUIDE_IMPLEMENTATION.md)

---

## 📱 Tester sur un appareil

### Via USB (recommandé)

1. Connectez votre téléphone Android via USB
2. Activez le mode développeur :
   - Allez à Paramètres → À propos du téléphone
   - Appuyez 7 fois sur "Numéro de version"
3. Activez le "Débogage USB" dans Paramètres → Options pour les développeurs
4. Cliquez sur Run dans Android Studio
5. Sélectionnez votre téléphone dans la liste

### Via Emulateur

1. Ouvrez Android Studio
2. Tools → Device Manager
3. Créez un nouvel émulateur (Pixel 5, Android 12, etc.)
4. Démarrez l'émulateur
5. Cliquez sur Run → Select Device
6. Choisissez l'émulateur

---

## 🧪 Tester l'application


✓ Test : 10 + 5 = 15
✓ Test : 20 - 8 = 12
✓ Test : 6 * 7 = 42
✓ Test : 100 / 4 = 25
✓ Test : 5 / 0 → Toast d'erreur
✓ Test : Champs vides → Toast d'erreur
```



## 📁 Structure des fichiers importants

```
calculette/
├── README.md                          # Description du projet
├── LICENSE                            # Licence MIT
├── CONTRIBUTING.md                    # Guide de contribution
├── CHANGELOG.md                       # Historique des versions
├── INSTRUCTIONS.md                    # Ce fichier
├── docs/
│   ├── GUIDE_IMPLEMENTATION.md        # Guide complet d'implémentation
│   ├── PLAN_TEST_ET_VALIDATION.md     # Cas de test
│   ├── EXPLICATIONS_ET_SNIPPETS.md    # Code expliqué
│   └── GUIDE_FIX_R_DOES_NOT_EXIST.md  # Solution d'erreur R
├── app/
│   ├── src/main/
│   │   ├── java/com/example/seance2/
│   │   │   └── MainActivity.java
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   │   └── activity_main.xml
│   │   │   ├── drawable/
│   │   │   │   ├── edit_text_bg.xml
│   │   │   │   ├── result_bg.xml
│   │   │   │   └── *.png (images du pendu)
│   │   │   └── values/
│   │   │       └── strings.xml
│   │   └── AndroidManifest.xml
│   └── build.gradle
├── build.gradle
├── settings.gradle
└── .gitignore
```

---

## 🔧 Commandes utiles

### Build et test

```bash
# Compiler le projet
./gradlew build

# Lancer les tests
./gradlew test

# Générer APK (debug)
./gradlew assembleDebug

# Générer APK (release)
./gradlew assembleRelease

# Nettoyer
./gradlew clean

# Vérifier la syntaxe (lint)
./gradlew lint
```

### Debugging

```bash
# Voir les logs en temps réel
adb logcat

# Filtrer par application
adb logcat | grep calculette

# Réinstaller l'app
adb install -r app/build/outputs/apk/debug/app-debug.apk
```

---


**Bon développement ! 🚀**

Si vous rencontrez des problèmes, consultez d'abord les guides dans `docs/`, puis posez une question. 😊
