package Lesson17_Task3

fun main() {
    val newDir = Directory("Angilation", 100)
    newDir.printStatusDir()
    newDir.changeDirPrivate(false)
    newDir.printStatusDir()
}

class Directory(name: String, countFiles: Int, security: Boolean = true) {
    val name: String = name
        get() = if (securityStatus) {
            println("Скрытая папка. Количество файлов = 0")
            ""
        } else field
    val countFiles: Int = countFiles
        get() = if (securityStatus) {
            println("Скрытая папка. Количество файлов = 0")
            0
        } else field


    private var securityStatus: Boolean = security

    fun printStatusDir() {
        println("NAME: $name")
        println("Count of files: $countFiles\n\n")
    }

    fun changeDirPrivate(status: Boolean) {
        securityStatus = status
        println("Security status for Directory = $securityStatus")
    }
}