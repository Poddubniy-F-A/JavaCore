package HW5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

import HW5.TicTacToe.Value;

public class Main {
    private static final Path BACKUP_PATH = Path.of("./backup");

    public static void main(String[] args) throws IOException {
        //createBackup("./.idea");

        FileOutputStream outputStream = new FileOutputStream("./answer.bin");
        outputStream.write(convertIntToByteArray(TicTacToe.zipToInt(new Value[]{
                Value.EMPTY, Value.CROSS, Value.ZERO,
                Value.EMPTY, Value.EMPTY, Value.CROSS,
                Value.CROSS, Value.CROSS, Value.ZERO
        })), 0, 3);
        outputStream.flush();
        outputStream.close();
    }

    private static void createBackup(String pathToSrc) throws IOException {
        Files.deleteIfExists(BACKUP_PATH);
        Files.createDirectory(BACKUP_PATH);

        File src = new File(pathToSrc);
        if (!src.exists()) {
            throw new FileNotFoundException(pathToSrc + " doesn't exist");
        } else if (src.isDirectory()) {
            for (File file : Objects.requireNonNull(src.listFiles(pathname -> !pathname.isDirectory()))) {
                Files.copy(file.toPath(), Path.of(BACKUP_PATH + "/" + file.getName()));
            }
        } else {
            Files.copy(src.toPath(), Path.of(BACKUP_PATH + "/" + src.getName()));
        }
    }

    private static byte[] convertIntToByteArray(int a) {
        final int size = Integer.SIZE / Byte.SIZE;

        byte[] result = new byte[size];
        for (int i = size - 1; i >= 0; i--) {
            result[i] = (byte) a;
            a >>= Byte.SIZE;
        }
        return result;
    }
}
