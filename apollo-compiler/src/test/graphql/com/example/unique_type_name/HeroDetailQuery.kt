// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.unique_type_name

import com.apollographql.apollo.api.Operation
import com.apollographql.apollo.api.OperationName
import com.apollographql.apollo.api.Query
import com.apollographql.apollo.api.Response
import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.ScalarTypeAdapters
import com.apollographql.apollo.api.ScalarTypeAdapters.Companion.DEFAULT
import com.apollographql.apollo.api.internal.OperationRequestBodyComposer
import com.apollographql.apollo.api.internal.QueryDocumentMinifier
import com.apollographql.apollo.api.internal.ResponseFieldMapper
import com.apollographql.apollo.api.internal.ResponseFieldMarshaller
import com.apollographql.apollo.api.internal.SimpleOperationResponseParser
import com.apollographql.apollo.api.internal.Throws
import com.example.unique_type_name.fragment.HeroDetails
import com.example.unique_type_name.type.Episode
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import okio.Buffer
import okio.BufferedSource
import okio.ByteString
import okio.IOException

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
class HeroDetailQuery : Query<HeroDetailQuery.Data, Operation.Variables> {
  override fun operationId(): String {
    return OPERATION_ID
  }

  override fun queryDocument(): String {
    return QUERY_DOCUMENT
  }

  override fun variables(): Operation.Variables {
    return Operation.EMPTY_VARIABLES
  }

  override fun name(): OperationName {
    return OPERATION_NAME
  }

  override fun responseFieldMapper(): ResponseFieldMapper<HeroDetailQuery.Data> {
    return ResponseFieldMapper.invoke {
      HeroDetailQuery_ResponseAdapter.fromResponse(it)
    }
  }

  @Throws(IOException::class)
  override fun parse(source: BufferedSource, scalarTypeAdapters: ScalarTypeAdapters):
      Response<HeroDetailQuery.Data> {
    return SimpleOperationResponseParser.parse(source, this, scalarTypeAdapters)
  }

  @Throws(IOException::class)
  override fun parse(byteString: ByteString, scalarTypeAdapters: ScalarTypeAdapters):
      Response<HeroDetailQuery.Data> {
    return parse(Buffer().write(byteString), scalarTypeAdapters)
  }

  @Throws(IOException::class)
  override fun parse(source: BufferedSource): Response<HeroDetailQuery.Data> {
    return parse(source, DEFAULT)
  }

  @Throws(IOException::class)
  override fun parse(byteString: ByteString): Response<HeroDetailQuery.Data> {
    return parse(byteString, DEFAULT)
  }

  override fun composeRequestBody(scalarTypeAdapters: ScalarTypeAdapters): ByteString {
    return OperationRequestBodyComposer.compose(
      operation = this,
      autoPersistQueries = false,
      withQueryDocument = true,
      scalarTypeAdapters = scalarTypeAdapters
    )
  }

  override fun composeRequestBody(): ByteString = OperationRequestBodyComposer.compose(
    operation = this,
    autoPersistQueries = false,
    withQueryDocument = true,
    scalarTypeAdapters = DEFAULT
  )

  override fun composeRequestBody(
    autoPersistQueries: Boolean,
    withQueryDocument: Boolean,
    scalarTypeAdapters: ScalarTypeAdapters
  ): ByteString = OperationRequestBodyComposer.compose(
    operation = this,
    autoPersistQueries = autoPersistQueries,
    withQueryDocument = withQueryDocument,
    scalarTypeAdapters = scalarTypeAdapters
  )

  /**
   * A character from the Star Wars universe
   */
  data class Node(
    override val __typename: String = "Character",
    /**
     * The name of the character
     */
    override val name: String
  ) : HeroDetails.Node {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller.invoke { writer ->
        writer.writeString(RESPONSE_FIELDS[0], this@Node.__typename)
        writer.writeString(RESPONSE_FIELDS[1], this@Node.name)
      }
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forString("__typename", "__typename", null, false, null),
        ResponseField.forString("name", "name", null, false, null)
      )
    }
  }

  /**
   * An edge object for a character's friends
   */
  data class Edge(
    override val __typename: String = "FriendsEdge",
    /**
     * The character represented by this friendship edge
     */
    override val node: HeroDetailQuery.Node?
  ) : HeroDetails.Edge {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller.invoke { writer ->
        writer.writeString(RESPONSE_FIELDS[0], this@Edge.__typename)
        writer.writeObject(RESPONSE_FIELDS[1], this@Edge.node?.marshaller())
      }
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forString("__typename", "__typename", null, false, null),
        ResponseField.forObject("node", "node", null, true, null)
      )
    }
  }

  /**
   * A connection object for a character's friends
   */
  data class FriendsConnection(
    override val __typename: String = "FriendsConnection",
    /**
     * The total number of friends
     */
    override val totalCount: Int?,
    /**
     * The edges for each of the character's friends.
     */
    override val edges: List<HeroDetailQuery.Edge?>?
  ) : HeroDetails.FriendsConnection {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller.invoke { writer ->
        writer.writeString(RESPONSE_FIELDS[0], this@FriendsConnection.__typename)
        writer.writeInt(RESPONSE_FIELDS[1], this@FriendsConnection.totalCount)
        writer.writeList(RESPONSE_FIELDS[2],
            this@FriendsConnection.edges) { value, listItemWriter ->
          value?.forEach { value ->
            listItemWriter.writeObject(value?.marshaller())}
        }
      }
    }

    fun edgesFilterNotNull(): List<HeroDetailQuery.Edge>? = edges?.filterNotNull()

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forString("__typename", "__typename", null, false, null),
        ResponseField.forInt("totalCount", "totalCount", null, true, null),
        ResponseField.forList("edges", "edges", null, true, null)
      )
    }
  }

  /**
   * A character from the Star Wars universe
   */
  data class Friend1(
    override val __typename: String = "Character",
    /**
     * The name of the character
     */
    override val name: String,
    /**
     * The friends of the character exposed as a connection with edges
     */
    override val friendsConnection: HeroDetailQuery.FriendsConnection
  ) : HeroDetails {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller.invoke { writer ->
        writer.writeString(RESPONSE_FIELDS[0], this@Friend1.__typename)
        writer.writeString(RESPONSE_FIELDS[1], this@Friend1.name)
        writer.writeObject(RESPONSE_FIELDS[2], this@Friend1.friendsConnection.marshaller())
      }
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forString("__typename", "__typename", null, false, null),
        ResponseField.forString("name", "name", null, false, null),
        ResponseField.forObject("friendsConnection", "friendsConnection", null, false, null)
      )
    }
  }

  /**
   * A character from the Star Wars universe
   */
  data class Friend(
    override val __typename: String = "Character",
    /**
     * The name of the character
     */
    override val name: String,
    /**
     * The movies this character appears in
     */
    val appearsIn: List<Episode?>,
    /**
     * The friends of the character, or an empty list if they have none
     */
    val friends: List<HeroDetailQuery.Friend1?>?
  ) : HeroDetailQuery.Friend3 {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller.invoke { writer ->
        writer.writeString(RESPONSE_FIELDS[0], this@Friend.__typename)
        writer.writeString(RESPONSE_FIELDS[1], this@Friend.name)
        writer.writeList(RESPONSE_FIELDS[2], this@Friend.appearsIn) { value, listItemWriter ->
          value?.forEach { value ->
            listItemWriter.writeString(value?.rawValue)}
        }
        writer.writeList(RESPONSE_FIELDS[3], this@Friend.friends) { value, listItemWriter ->
          value?.forEach { value ->
            listItemWriter.writeObject(value?.marshaller())}
        }
      }
    }

    fun appearsInFilterNotNull(): List<Episode> = appearsIn.filterNotNull()

    fun friendsFilterNotNull(): List<HeroDetailQuery.Friend1>? = friends?.filterNotNull()

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forString("__typename", "__typename", null, false, null),
        ResponseField.forString("name", "name", null, false, null),
        ResponseField.forList("appearsIn", "appearsIn", null, false, null),
        ResponseField.forList("friends", "friends", null, true, null)
      )
    }
  }

  /**
   * A humanoid creature from the Star Wars universe
   */
  data class Human(
    override val __typename: String = "Human",
    /**
     * What this human calls themselves
     */
    override val name: String,
    /**
     * This human's friends, or an empty list if they have none
     */
    override val friends: List<HeroDetailQuery.Friend?>?,
    /**
     * Height in the preferred unit, default is meters
     */
    val height: Double?
  ) : HeroDetailQuery.HeroDetailQuery1 {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller.invoke { writer ->
        writer.writeString(RESPONSE_FIELDS[0], this@Human.__typename)
        writer.writeString(RESPONSE_FIELDS[1], this@Human.name)
        writer.writeList(RESPONSE_FIELDS[2], this@Human.friends) { value, listItemWriter ->
          value?.forEach { value ->
            listItemWriter.writeObject(value?.marshaller())}
        }
        writer.writeDouble(RESPONSE_FIELDS[3], this@Human.height)
      }
    }

    fun friendsFilterNotNull(): List<HeroDetailQuery.Friend>? = friends?.filterNotNull()

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forString("__typename", "__typename", null, false, null),
        ResponseField.forString("name", "name", null, false, null),
        ResponseField.forList("friends", "friends", null, true, null),
        ResponseField.forDouble("height", "height", null, true, null)
      )
    }
  }

  /**
   * A character from the Star Wars universe
   */
  data class Friend2(
    override val __typename: String = "Character",
    /**
     * The name of the character
     */
    override val name: String
  ) : HeroDetailQuery.Friend3 {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller.invoke { writer ->
        writer.writeString(RESPONSE_FIELDS[0], this@Friend2.__typename)
        writer.writeString(RESPONSE_FIELDS[1], this@Friend2.name)
      }
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forString("__typename", "__typename", null, false, null),
        ResponseField.forString("name", "name", null, false, null)
      )
    }
  }

  /**
   * A character from the Star Wars universe
   */
  data class OtherHeroDetailQuery(
    override val __typename: String = "Character",
    /**
     * The name of the character
     */
    override val name: String,
    /**
     * The friends of the character, or an empty list if they have none
     */
    override val friends: List<HeroDetailQuery.Friend2?>?
  ) : HeroDetailQuery.HeroDetailQuery1 {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller.invoke { writer ->
        writer.writeString(RESPONSE_FIELDS[0], this@OtherHeroDetailQuery.__typename)
        writer.writeString(RESPONSE_FIELDS[1], this@OtherHeroDetailQuery.name)
        writer.writeList(RESPONSE_FIELDS[2],
            this@OtherHeroDetailQuery.friends) { value, listItemWriter ->
          value?.forEach { value ->
            listItemWriter.writeObject(value?.marshaller())}
        }
      }
    }

    fun friendsFilterNotNull(): List<HeroDetailQuery.Friend2>? = friends?.filterNotNull()

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forString("__typename", "__typename", null, false, null),
        ResponseField.forString("name", "name", null, false, null),
        ResponseField.forList("friends", "friends", null, true, null)
      )
    }
  }

  /**
   * A character from the Star Wars universe
   */
  interface Friend3 {
    val __typename: String

    /**
     * The name of the character
     */
    val name: String

    fun marshaller(): ResponseFieldMarshaller
  }

  /**
   * A character from the Star Wars universe
   */
  interface HeroDetailQuery1 {
    val __typename: String

    /**
     * The name of the character
     */
    val name: String

    /**
     * The friends of the character, or an empty list if they have none
     */
    val friends: List<HeroDetailQuery.Friend3?>?

    fun asHuman(): HeroDetailQuery.Human? = this as? HeroDetailQuery.Human

    fun marshaller(): ResponseFieldMarshaller
  }

  /**
   * Data from the response after executing this GraphQL operation
   */
  data class Data(
    val heroDetailQuery: HeroDetailQuery.HeroDetailQuery1?
  ) : Operation.Data {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller.invoke { writer ->
        writer.writeObject(RESPONSE_FIELDS[0], this@Data.heroDetailQuery?.marshaller())
      }
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forObject("heroDetailQuery", "heroDetailQuery", null, true, null)
      )
    }
  }

  companion object {
    const val OPERATION_ID: String =
        "11473383397766137d7923128dd8cd6f27fcab32df9d9c091f08cf12a893a556"

    val QUERY_DOCUMENT: String = QueryDocumentMinifier.minify(
          """
          |query HeroDetailQuery {
          |  heroDetailQuery {
          |    __typename
          |    name
          |    friends {
          |      __typename
          |      name
          |    }
          |    ... on Human {
          |      height
          |      friends {
          |        __typename
          |        appearsIn
          |        friends {
          |          __typename
          |          ...HeroDetails
          |        }
          |      }
          |    }
          |  }
          |}
          |fragment HeroDetails on Character {
          |  __typename
          |  name
          |  friendsConnection {
          |    __typename
          |    totalCount
          |    edges {
          |      __typename
          |      node {
          |        __typename
          |        name
          |      }
          |    }
          |  }
          |}
          """.trimMargin()
        )

    val OPERATION_NAME: OperationName = object : OperationName {
      override fun name(): String {
        return "HeroDetailQuery"
      }
    }
  }
}
