class CaseOne<T : Steps> : TestRunner<T> {
    override fun runTest(steps: T, test: () -> Unit) {
        steps.javaClass.methods.filter { it.name.startsWith("before") }
            .forEach {
                println("....Запуск before методов....")
                it.invoke(steps)
            }
        println("....Запуск теста.....")
        test.invoke()
        steps.javaClass.methods.filter { it.name.startsWith("after") }
            .forEach {
                println("....Запуск after методов....")
                it.invoke(steps)
            }
    }
}
