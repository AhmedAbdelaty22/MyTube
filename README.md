# MyTube

A small Java example of **dependency injection** and **programming to interfaces**, built around a simulated video upload service.

## What it does

When a video is uploaded, `VideoProcessor` does three things:

1. Encodes the video
2. Stores the video's details in a database
3. Sends the uploader an email

Each step is simulated by printing to the console.

## Design

`VideoProcessor` doesn't create the classes it uses. It only knows about three interfaces, and the actual implementations are passed in through its constructor (constructor injection).

| Interface | Implementation in this project |
|---|---|
| `VideoEncoder` | `XVideoEncoder` |
| `VideoDatabase` | `SqlVideoDatabase` |
| `NotificationService` | `EmailService` |

Because of this, you can swap one part for another without touching `VideoProcessor`. For example, you could store videos in a different database or send a text message instead of an email. It also makes `VideoProcessor` easy to test with fake implementations.

```java
var processor = new VideoProcessor(
        new XVideoEncoder(),
        new SqlVideoDatabase(),
        new EmailService());
processor.process(video);
```

## Output

```
Encoding video...
Done!

Storing video metadata in a SQL database...
Title: Jennifer's birthday
File Name: birthday.mp4
Done!

Notifying john@domain.com...
Done!
```

## Requirements

- Java 25 or newer. `Main.java` is a compact source file (`void main()` with no class around it) and the code uses the `IO` class, both standard since Java 25.

## How to run

**IntelliJ IDEA:** open the project folder and run `src/Main.java`.

**Terminal:** from the project folder, run:

```bash
java src/Main.java
```

Java finds the other classes in `src/` automatically.
