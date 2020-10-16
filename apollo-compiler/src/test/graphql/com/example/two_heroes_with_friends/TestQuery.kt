// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.two_heroes_with_friends

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
import com.example.two_heroes_with_friends.type.CustomType
import kotlin.Array
import kotlin.Boolean
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
class TestQuery : Query<TestQuery.Data, Operation.Variables> {
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

  override fun responseFieldMapper(): ResponseFieldMapper<TestQuery.Data> {
    return ResponseFieldMapper.invoke {
      TestQuery_ResponseAdapter.fromResponse(it)
    }
  }

  @Throws(IOException::class)
  override fun parse(source: BufferedSource, scalarTypeAdapters: ScalarTypeAdapters):
      Response<TestQuery.Data> {
    return SimpleOperationResponseParser.parse(source, this, scalarTypeAdapters)
  }

  @Throws(IOException::class)
  override fun parse(byteString: ByteString, scalarTypeAdapters: ScalarTypeAdapters):
      Response<TestQuery.Data> {
    return parse(Buffer().write(byteString), scalarTypeAdapters)
  }

  @Throws(IOException::class)
  override fun parse(source: BufferedSource): Response<TestQuery.Data> {
    return parse(source, DEFAULT)
  }

  @Throws(IOException::class)
  override fun parse(byteString: ByteString): Response<TestQuery.Data> {
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
    val __typename: String = "Character",
    /**
     * The name of the character
     */
    val name: String
  ) {
    fun marshaller(): ResponseFieldMarshaller {
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
    val __typename: String = "FriendsEdge",
    /**
     * The character represented by this friendship edge
     */
    val node: TestQuery.Node?
  ) {
    fun marshaller(): ResponseFieldMarshaller {
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
    val __typename: String = "FriendsConnection",
    /**
     * The total number of friends
     */
    val totalCount: Int?,
    /**
     * The edges for each of the character's friends.
     */
    val edges: List<TestQuery.Edge?>?
  ) {
    fun marshaller(): ResponseFieldMarshaller {
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

    fun edgesFilterNotNull(): List<TestQuery.Edge>? = edges?.filterNotNull()

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
  data class R2(
    val __typename: String = "Character",
    /**
     * The name of the character
     */
    val name: String,
    /**
     * The friends of the character exposed as a connection with edges
     */
    val friendsConnection: TestQuery.FriendsConnection
  ) {
    fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller.invoke { writer ->
        writer.writeString(RESPONSE_FIELDS[0], this@R2.__typename)
        writer.writeString(RESPONSE_FIELDS[1], this@R2.name)
        writer.writeObject(RESPONSE_FIELDS[2], this@R2.friendsConnection.marshaller())
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
  data class Node1(
    val __typename: String = "Character",
    /**
     * The name of the character
     */
    val name: String
  ) {
    fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller.invoke { writer ->
        writer.writeString(RESPONSE_FIELDS[0], this@Node1.__typename)
        writer.writeString(RESPONSE_FIELDS[1], this@Node1.name)
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
  data class Edge1(
    val __typename: String = "FriendsEdge",
    /**
     * The character represented by this friendship edge
     */
    val node: TestQuery.Node1?
  ) {
    fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller.invoke { writer ->
        writer.writeString(RESPONSE_FIELDS[0], this@Edge1.__typename)
        writer.writeObject(RESPONSE_FIELDS[1], this@Edge1.node?.marshaller())
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
  data class FriendsConnection1(
    val __typename: String = "FriendsConnection",
    /**
     * The total number of friends
     */
    val totalCount: Int?,
    /**
     * The edges for each of the character's friends.
     */
    val edges: List<TestQuery.Edge1?>?
  ) {
    fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller.invoke { writer ->
        writer.writeString(RESPONSE_FIELDS[0], this@FriendsConnection1.__typename)
        writer.writeInt(RESPONSE_FIELDS[1], this@FriendsConnection1.totalCount)
        writer.writeList(RESPONSE_FIELDS[2],
            this@FriendsConnection1.edges) { value, listItemWriter ->
          value?.forEach { value ->
            listItemWriter.writeObject(value?.marshaller())}
        }
      }
    }

    fun edgesFilterNotNull(): List<TestQuery.Edge1>? = edges?.filterNotNull()

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
  data class Luke(
    val __typename: String = "Character",
    /**
     * The ID of the character
     */
    val id: String,
    /**
     * The name of the character
     */
    val name: String,
    /**
     * The friends of the character exposed as a connection with edges
     */
    val friendsConnection: TestQuery.FriendsConnection1
  ) {
    fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller.invoke { writer ->
        writer.writeString(RESPONSE_FIELDS[0], this@Luke.__typename)
        writer.writeCustom(RESPONSE_FIELDS[1] as ResponseField.CustomTypeField, this@Luke.id)
        writer.writeString(RESPONSE_FIELDS[2], this@Luke.name)
        writer.writeObject(RESPONSE_FIELDS[3], this@Luke.friendsConnection.marshaller())
      }
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forString("__typename", "__typename", null, false, null),
        ResponseField.forCustomType("id", "id", null, false, CustomType.ID, null),
        ResponseField.forString("name", "name", null, false, null),
        ResponseField.forObject("friendsConnection", "friendsConnection", null, false, null)
      )
    }
  }

  /**
   * Data from the response after executing this GraphQL operation
   */
  data class Data(
    val r2: TestQuery.R2?,
    val luke: TestQuery.Luke?
  ) : Operation.Data {
    override fun marshaller(): ResponseFieldMarshaller {
      return ResponseFieldMarshaller.invoke { writer ->
        writer.writeObject(RESPONSE_FIELDS[0], this@Data.r2?.marshaller())
        writer.writeObject(RESPONSE_FIELDS[1], this@Data.luke?.marshaller())
      }
    }

    companion object {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField.forObject("r2", "hero", null, true, null),
        ResponseField.forObject("luke", "hero", mapOf<String, Any>(
          "episode" to "EMPIRE"), true, null)
      )
    }
  }

  companion object {
    const val OPERATION_ID: String =
        "21133941aec3d5db7db82cc2688faa410a90b34e7cb283efa038fe67526b6b4b"

    val QUERY_DOCUMENT: String = QueryDocumentMinifier.minify(
          """
          |query TestQuery {
          |  r2: hero {
          |    __typename
          |    name
          |    friendsConnection {
          |      __typename
          |      totalCount
          |      edges {
          |        __typename
          |        node {
          |          __typename
          |          name
          |        }
          |      }
          |    }
          |  }
          |  luke: hero(episode: EMPIRE) {
          |    __typename
          |    id
          |    name
          |    friendsConnection {
          |      __typename
          |      totalCount
          |      edges {
          |        __typename
          |        node {
          |          __typename
          |          name
          |        }
          |      }
          |    }
          |  }
          |}
          """.trimMargin()
        )

    val OPERATION_NAME: OperationName = object : OperationName {
      override fun name(): String {
        return "TestQuery"
      }
    }
  }
}
