# MuchException
## Error handling for good bois

![error image](https://github.com/jpsheehan/MuchException/raw/master/MuchException/image.png)

### Installing:

Download the latest version:

```bash
	wget https://github.com/jpsheehan/MuchException/raw/master/MuchException.java
```

Or clone the repository:

```bash
	git clone https://github.com/jpsheehan/MuchException.git
```

### Usage:

Simply throw MuchException instead of a generic exception:

```java
	throw new MuchException("Something went wrong...");
```

MuchException also wraps existing exceptions:

```java
	throw new MuchException(new IllegalArgumentException("Uh oh!"));
```
