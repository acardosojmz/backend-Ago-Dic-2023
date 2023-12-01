package structural_pattern.proxy

class NormalFile : IFile {
    override fun read(name: String) = println("Reading file: $name")
}