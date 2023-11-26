class Case<T, E>(var item: T, var item2: E): Storage<T> {

    override fun get(): T {
        return item
    }

    override fun add(item: T) {
        this.item = item
    }

    fun get2(): E{
        return item2
    }
}