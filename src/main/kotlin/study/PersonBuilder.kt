package study

class PersonBuilder {
    private lateinit var name: String
    private var company: String? = null
    private var skills: Skills = Skills()
    private var languages: Languages = Languages()

    fun name(name: String) {
        this.name = name
    }

    fun company(company: String) {
        this.company = company
    }

    fun skills(initializer: Skills.() -> Unit) {
        skills.apply(initializer)
    }

    fun languages(initializer: Languages.() -> Unit) {
        languages.apply(initializer)
    }

    fun build(): Person = Person(name, company, skills, languages)
}
