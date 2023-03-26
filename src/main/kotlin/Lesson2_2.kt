fun main() {
    val oldWorkers = 50
    val salaryOldWorkers = 30000

    val newStagers = 30
    val salaryStagers = 20000

    val oldStaffSalary = oldWorkers*salaryOldWorkers
    val totalSalary = oldStaffSalary + newStagers*salaryStagers
    val averageSalary = totalSalary/(oldWorkers+newStagers)

    println("Расходы на выплату зарплаты постоянных сотрудников: $oldStaffSalary рублей")
    println("Общие расходы по ЗП после прихода стажеров: $totalSalary рублей")
    println("Среднюю ЗП одного сотрудника после устройства стажеров: $averageSalary рублей")
}