// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.two_heroes_with_friends

import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.apollographql.apollo.api.internal.ResponseReader
import com.example.two_heroes_with_friends.type.CustomType
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
internal object TestQuery_ResponseAdapter : ResponseAdapter<TestQuery.Data> {
  private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
    ResponseField.forObject("r2", "hero", null, true, null),
    ResponseField.forObject("luke", "hero", mapOf<String, Any>(
      "episode" to "EMPIRE"), true, null)
  )

  override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Data {
    return reader.run {
      var r2: TestQuery.R2? = null
      var luke: TestQuery.Luke? = null
      while(true) {
        when (selectField(RESPONSE_FIELDS)) {
          0 -> r2 = readObject<TestQuery.R2>(RESPONSE_FIELDS[0]) { reader ->
            TestQuery_ResponseAdapter.R2_ResponseAdapter.fromResponse(reader)
          }
          1 -> luke = readObject<TestQuery.Luke>(RESPONSE_FIELDS[1]) { reader ->
            TestQuery_ResponseAdapter.Luke_ResponseAdapter.fromResponse(reader)
          }
          else -> break
        }
      }
      TestQuery.Data(
        r2 = r2,
        luke = luke
      )
    }
  }

  object Node_ResponseAdapter : ResponseAdapter<TestQuery.Node> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forString("name", "name", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Node {
      return reader.run {
        var __typename: String? = __typename
        var name: String? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> name = readString(RESPONSE_FIELDS[1])
            else -> break
          }
        }
        TestQuery.Node(
          __typename = __typename!!,
          name = name!!
        )
      }
    }
  }

  object Edge_ResponseAdapter : ResponseAdapter<TestQuery.Edge> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forObject("node", "node", null, true, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Edge {
      return reader.run {
        var __typename: String? = __typename
        var node: TestQuery.Node? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> node = readObject<TestQuery.Node>(RESPONSE_FIELDS[1]) { reader ->
              TestQuery_ResponseAdapter.Node_ResponseAdapter.fromResponse(reader)
            }
            else -> break
          }
        }
        TestQuery.Edge(
          __typename = __typename!!,
          node = node
        )
      }
    }
  }

  object FriendsConnection_ResponseAdapter : ResponseAdapter<TestQuery.FriendsConnection> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forInt("totalCount", "totalCount", null, true, null),
      ResponseField.forList("edges", "edges", null, true, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?):
        TestQuery.FriendsConnection {
      return reader.run {
        var __typename: String? = __typename
        var totalCount: Int? = null
        var edges: List<TestQuery.Edge?>? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> totalCount = readInt(RESPONSE_FIELDS[1])
            2 -> edges = readList<TestQuery.Edge>(RESPONSE_FIELDS[2]) { reader ->
              reader.readObject<TestQuery.Edge> { reader ->
                TestQuery_ResponseAdapter.Edge_ResponseAdapter.fromResponse(reader)
              }
            }
            else -> break
          }
        }
        TestQuery.FriendsConnection(
          __typename = __typename!!,
          totalCount = totalCount,
          edges = edges
        )
      }
    }
  }

  object R2_ResponseAdapter : ResponseAdapter<TestQuery.R2> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forString("name", "name", null, false, null),
      ResponseField.forObject("friendsConnection", "friendsConnection", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.R2 {
      return reader.run {
        var __typename: String? = __typename
        var name: String? = null
        var friendsConnection: TestQuery.FriendsConnection? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> name = readString(RESPONSE_FIELDS[1])
            2 -> friendsConnection = readObject<TestQuery.FriendsConnection>(RESPONSE_FIELDS[2]) { reader ->
              TestQuery_ResponseAdapter.FriendsConnection_ResponseAdapter.fromResponse(reader)
            }
            else -> break
          }
        }
        TestQuery.R2(
          __typename = __typename!!,
          name = name!!,
          friendsConnection = friendsConnection!!
        )
      }
    }
  }

  object Node1_ResponseAdapter : ResponseAdapter<TestQuery.Node1> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forString("name", "name", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Node1 {
      return reader.run {
        var __typename: String? = __typename
        var name: String? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> name = readString(RESPONSE_FIELDS[1])
            else -> break
          }
        }
        TestQuery.Node1(
          __typename = __typename!!,
          name = name!!
        )
      }
    }
  }

  object Edge1_ResponseAdapter : ResponseAdapter<TestQuery.Edge1> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forObject("node", "node", null, true, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Edge1 {
      return reader.run {
        var __typename: String? = __typename
        var node: TestQuery.Node1? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> node = readObject<TestQuery.Node1>(RESPONSE_FIELDS[1]) { reader ->
              TestQuery_ResponseAdapter.Node1_ResponseAdapter.fromResponse(reader)
            }
            else -> break
          }
        }
        TestQuery.Edge1(
          __typename = __typename!!,
          node = node
        )
      }
    }
  }

  object FriendsConnection1_ResponseAdapter : ResponseAdapter<TestQuery.FriendsConnection1> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forInt("totalCount", "totalCount", null, true, null),
      ResponseField.forList("edges", "edges", null, true, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?):
        TestQuery.FriendsConnection1 {
      return reader.run {
        var __typename: String? = __typename
        var totalCount: Int? = null
        var edges: List<TestQuery.Edge1?>? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> totalCount = readInt(RESPONSE_FIELDS[1])
            2 -> edges = readList<TestQuery.Edge1>(RESPONSE_FIELDS[2]) { reader ->
              reader.readObject<TestQuery.Edge1> { reader ->
                TestQuery_ResponseAdapter.Edge1_ResponseAdapter.fromResponse(reader)
              }
            }
            else -> break
          }
        }
        TestQuery.FriendsConnection1(
          __typename = __typename!!,
          totalCount = totalCount,
          edges = edges
        )
      }
    }
  }

  object Luke_ResponseAdapter : ResponseAdapter<TestQuery.Luke> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forCustomType("id", "id", null, false, CustomType.ID, null),
      ResponseField.forString("name", "name", null, false, null),
      ResponseField.forObject("friendsConnection", "friendsConnection", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Luke {
      return reader.run {
        var __typename: String? = __typename
        var id: String? = null
        var name: String? = null
        var friendsConnection: TestQuery.FriendsConnection1? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> id = readCustomType<String>(RESPONSE_FIELDS[1] as ResponseField.CustomTypeField)
            2 -> name = readString(RESPONSE_FIELDS[2])
            3 -> friendsConnection = readObject<TestQuery.FriendsConnection1>(RESPONSE_FIELDS[3]) { reader ->
              TestQuery_ResponseAdapter.FriendsConnection1_ResponseAdapter.fromResponse(reader)
            }
            else -> break
          }
        }
        TestQuery.Luke(
          __typename = __typename!!,
          id = id!!,
          name = name!!,
          friendsConnection = friendsConnection!!
        )
      }
    }
  }
}
