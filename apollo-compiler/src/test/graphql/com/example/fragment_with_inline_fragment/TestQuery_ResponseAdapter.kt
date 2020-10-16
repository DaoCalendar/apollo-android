// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.fragment_with_inline_fragment

import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.apollographql.apollo.api.internal.ResponseReader
import com.example.fragment_with_inline_fragment.type.Episode
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
    ResponseField.forObject("hero", "hero", null, true, null)
  )

  override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Data {
    return reader.run {
      var hero: TestQuery.Hero? = null
      while(true) {
        when (selectField(RESPONSE_FIELDS)) {
          0 -> hero = readObject<TestQuery.Hero>(RESPONSE_FIELDS[0]) { reader ->
            TestQuery_ResponseAdapter.Hero_ResponseAdapter.fromResponse(reader)
          }
          else -> break
        }
      }
      TestQuery.Data(
        hero = hero
      )
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

  object HeroDetailsDroidDroidDetailsImpl_ResponseAdapter :
      ResponseAdapter<TestQuery.HeroDetailsDroidDroidDetailsImpl> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forString("name", "name", null, false, null),
      ResponseField.forObject("friendsConnection", "friendsConnection", null, false, null),
      ResponseField.forString("primaryFunction", "primaryFunction", null, true, null),
      ResponseField.forList("appearsIn", "appearsIn", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?):
        TestQuery.HeroDetailsDroidDroidDetailsImpl {
      return reader.run {
        var __typename: String? = __typename
        var name: String? = null
        var friendsConnection: TestQuery.FriendsConnection1? = null
        var primaryFunction: String? = null
        var appearsIn: List<Episode?>? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> name = readString(RESPONSE_FIELDS[1])
            2 -> friendsConnection = readObject<TestQuery.FriendsConnection1>(RESPONSE_FIELDS[2]) { reader ->
              TestQuery_ResponseAdapter.FriendsConnection1_ResponseAdapter.fromResponse(reader)
            }
            3 -> primaryFunction = readString(RESPONSE_FIELDS[3])
            4 -> appearsIn = readList<Episode>(RESPONSE_FIELDS[4]) { reader ->
              Episode.safeValueOf(reader.readString())
            }
            else -> break
          }
        }
        TestQuery.HeroDetailsDroidDroidDetailsImpl(
          __typename = __typename!!,
          name = name!!,
          friendsConnection = friendsConnection!!,
          primaryFunction = primaryFunction,
          appearsIn = appearsIn!!
        )
      }
    }
  }

  object Node2_ResponseAdapter : ResponseAdapter<TestQuery.Node2> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forString("name", "name", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Node2 {
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
        TestQuery.Node2(
          __typename = __typename!!,
          name = name!!
        )
      }
    }
  }

  object Edge2_ResponseAdapter : ResponseAdapter<TestQuery.Edge2> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forObject("node", "node", null, true, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Edge2 {
      return reader.run {
        var __typename: String? = __typename
        var node: TestQuery.Node2? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> node = readObject<TestQuery.Node2>(RESPONSE_FIELDS[1]) { reader ->
              TestQuery_ResponseAdapter.Node2_ResponseAdapter.fromResponse(reader)
            }
            else -> break
          }
        }
        TestQuery.Edge2(
          __typename = __typename!!,
          node = node
        )
      }
    }
  }

  object FriendsConnection2_ResponseAdapter : ResponseAdapter<TestQuery.FriendsConnection2> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forInt("totalCount", "totalCount", null, true, null),
      ResponseField.forList("edges", "edges", null, true, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?):
        TestQuery.FriendsConnection2 {
      return reader.run {
        var __typename: String? = __typename
        var totalCount: Int? = null
        var edges: List<TestQuery.Edge2?>? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> totalCount = readInt(RESPONSE_FIELDS[1])
            2 -> edges = readList<TestQuery.Edge2>(RESPONSE_FIELDS[2]) { reader ->
              reader.readObject<TestQuery.Edge2> { reader ->
                TestQuery_ResponseAdapter.Edge2_ResponseAdapter.fromResponse(reader)
              }
            }
            else -> break
          }
        }
        TestQuery.FriendsConnection2(
          __typename = __typename!!,
          totalCount = totalCount,
          edges = edges
        )
      }
    }
  }

  object HeroDetailsHumanDetailsImpl_ResponseAdapter :
      ResponseAdapter<TestQuery.HeroDetailsHumanDetailsImpl> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forString("name", "name", null, false, null),
      ResponseField.forObject("friendsConnection", "friendsConnection", null, false, null),
      ResponseField.forList("appearsIn", "appearsIn", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?):
        TestQuery.HeroDetailsHumanDetailsImpl {
      return reader.run {
        var __typename: String? = __typename
        var name: String? = null
        var friendsConnection: TestQuery.FriendsConnection2? = null
        var appearsIn: List<Episode?>? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> name = readString(RESPONSE_FIELDS[1])
            2 -> friendsConnection = readObject<TestQuery.FriendsConnection2>(RESPONSE_FIELDS[2]) { reader ->
              TestQuery_ResponseAdapter.FriendsConnection2_ResponseAdapter.fromResponse(reader)
            }
            3 -> appearsIn = readList<Episode>(RESPONSE_FIELDS[3]) { reader ->
              Episode.safeValueOf(reader.readString())
            }
            else -> break
          }
        }
        TestQuery.HeroDetailsHumanDetailsImpl(
          __typename = __typename!!,
          name = name!!,
          friendsConnection = friendsConnection!!,
          appearsIn = appearsIn!!
        )
      }
    }
  }

  object OtherHero_ResponseAdapter : ResponseAdapter<TestQuery.OtherHero> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forString("name", "name", null, false, null),
      ResponseField.forList("appearsIn", "appearsIn", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.OtherHero {
      return reader.run {
        var __typename: String? = __typename
        var name: String? = null
        var appearsIn: List<Episode?>? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> name = readString(RESPONSE_FIELDS[1])
            2 -> appearsIn = readList<Episode>(RESPONSE_FIELDS[2]) { reader ->
              Episode.safeValueOf(reader.readString())
            }
            else -> break
          }
        }
        TestQuery.OtherHero(
          __typename = __typename!!,
          name = name!!,
          appearsIn = appearsIn!!
        )
      }
    }
  }

  object Hero_ResponseAdapter : ResponseAdapter<TestQuery.Hero> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forString("name", "name", null, false, null),
      ResponseField.forList("appearsIn", "appearsIn", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Hero {
      val typename = __typename ?: reader.readString(RESPONSE_FIELDS[0])
      return when(typename) {
        "Droid" -> TestQuery_ResponseAdapter.HeroDetailsDroidDroidDetailsImpl_ResponseAdapter.fromResponse(reader, typename)
        "Human" -> TestQuery_ResponseAdapter.HeroDetailsHumanDetailsImpl_ResponseAdapter.fromResponse(reader, typename)
        else -> TestQuery_ResponseAdapter.OtherHero_ResponseAdapter.fromResponse(reader, typename)
      }
    }
  }
}
