# Wilder Creatures

[![Minecraft](https://img.shields.io/badge/Minecraft-26.3-green)](https://www.minecraft.net/)
[![Fabric](https://img.shields.io/badge/Fabric-0.19%2B-yellow)](https://fabricmc.net/)
[![GeckoLib](https://img.shields.io/badge/GeckoLib-5.5-blue)](https://github.com/bernie-g/geckolib)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

A Fabric mod for **Minecraft 26.3** that adds immersive, high-quality wild animals inspired by *Untamed Wilds*.

---

## Current Features

### Jaguar
- Predatory AI (hunts players when nearby or when injured, also hunts small animals)
- Solid combat stats (30 HP, 7 attack damage)
- Breedable with raw/cooked beef, porkchop, or mutton
- Fully GeckoLib-powered animations (idle, walk, run, attack)
- Spawn egg included

---

## Requirements

| Dependency     | Version     |
|----------------|-------------|
| Minecraft      | 26.3        |
| Fabric Loader  | ≥ 0.19.0    |
| Fabric API     | 0.165.0+26.3 (or newer) |
| GeckoLib       | 5.5.x       |
| Java           | 25          |

---

## Building from Source

```bash
git clone https://github.com/YOUR_USERNAME/wildercreatures.git
cd wildercreatures
./gradlew build
```

The compiled jar will be in `build/libs/wildercreatures-0.1.0.jar`.

To run the client for testing:

```bash
./gradlew runClient
```

---

## Project Structure

```
src/main/java/com/wildercreatures/
├── WilderCreatures.java          # Main entrypoint
├── entity/JaguarEntity.java      # Jaguar AI + GeckoLib
├── client/
│   ├── WilderCreaturesClient.java
│   ├── JaguarModel.java
│   └── JaguarRenderer.java
└── registry/
    ├── ModEntities.java
    └── ModItems.java
```

---

## Making a Better Jaguar Model

The included model and animations are **placeholders**.

1. Open [Blockbench](https://blockbench.net/)
2. Create a new **GeckoLib** model
3. Build a detailed jaguar
4. Create these exact animation names:
   - `animation.jaguar.idle`
   - `animation.jaguar.walk`
   - `animation.jaguar.run`
   - `animation.jaguar.attack`
5. Export and replace the files in:
   - `src/main/resources/assets/wildercreatures/geo/jaguar.geo.json`
   - `src/main/resources/assets/wildercreatures/animations/jaguar.animation.json`
6. Add your texture as `textures/entity/jaguar.png`

---

## Planned Features

- Natural spawning in Jungles and Forests
- More animals (Lynx, Boar, Aardvark, Snakes, etc.)
- Config options
- Improved AI (stalking, sleeping, territory)

---

## License

This project is licensed under the **MIT License** – see the [LICENSE](LICENSE) file for details.

---

## Credits

- Inspired by **Untamed Wilds** by raytrace82
- Animation engine: [GeckoLib](https://github.com/bernie-g/geckolib)
- Built with Fabric
