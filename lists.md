# Créer une liste d'éléments

Compose nous permet de placer manuellement des éléments les uns à la suite des autres à la verticale ou à l'horizontale grâce à `Column` ou `Row`.
Mais il est aussi possible d'afficher une liste dynamiquement.

Pour cette leçon, nous utiliserons un écran simple avec un titre 

## La méthode bête et méchante

La première méthode est d'utiliser un `foreach` sur la liste des données au sein d'une colonne ou ligne.

``` kotlin
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Screen(labels: List<String>) = Scaffold(
    topBar = {
        TopAppBar { Text("List d\'éléments") }
    }
) {
    Column {
        labels.forEach {
            Text(text = it)
        }
    }
}
```

![Screenshot 2022-11-30 at 16 47 50](https://user-images.githubusercontent.com/32436781/204844504-2c1c389b-0996-49cb-a8a9-c98af532a52a.png)

Cette méthode peut être utilisée pour des listes très restreinte mais elle n'est pas optimisée pour le rendu de longues listes et peut être très gourmande en resources.
Il est alors recommandé d'utilisr un `LazyColumn` ou un `LazyRow`.

## Don't Worry, Be Lazy

Les `LazyColumn` et `LazyRow` sont très intéressantes pour l'affichage de longues listes de données car elles ne dessinent que les éléments visibles.
Si l'écran ou le layout ne permettent d'affiche que 10 éléments, alors seuls 10 éléments seront chargés. Les autres éléments seront chargés quand l'utilisateur "scrollera" et les éléments qui disparaîssent seront déchargés.

Un autre avantage des `LazyXxxx`, c'est qu'ils gèrent automatiquement le `scroll` (il n'est donc pas nécessaire d'ajouter un `Modifier` pour donner cette capacité), mais aussi de permettre d'ajouter des éléments manuellement à la liste.
Par exemple, avant d'afficher la liste dynamique de donnée, on peut ajouter manuellement un titre. Pour ce faire, on appellera la fonction `item` du `LazyXxxxScope` (1.).

``` kotlin
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Screen(labels: List<String>) = Scaffold(
    topBar = {
        TopAppBar { Text("List d\'éléments") }
    }
) {
    LazyColumn {
        item { Text("Élément simple") }
        items(labels) { label ->
            Text(label)
        }
    }
}
```

![Screenshot 2022-11-30 at 16 51 04](https://user-images.githubusercontent.com/32436781/204844844-eca4094d-920a-4d2d-80c3-002451e2d3be.png)

(1.) Un scope permet de fournir des fonctionnalités supplémentaires dans un context particulier. Dans le cas du `LazyColumn`, le scope ajoutera les fonctions pour ajouter des éléments manuellement ou dynamiquement.
