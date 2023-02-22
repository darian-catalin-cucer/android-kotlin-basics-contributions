data class Contributor(val name: String, val contributions: Int)

val contributors = listOf(
    Contributor("John Doe", 12),
    Contributor("Jane Smith", 8),
    Contributor("Bob Johnson", 4)
)

// Sort contributors by number of contributions in descending order
val sortedContributors = contributors.sortedByDescending { it.contributions }

// Display the list of contributors and their contributions
for (contributor in sortedContributors) {
    println("${contributor.name}: ${contributor.contributions} contributions")
}
