/**
 * Autogenerated by Thrift for src/module.thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

#include "thrift/compiler/test/fixtures/enums/gen-cpp2/module_data.h"

#include <thrift/lib/cpp2/gen/module_data_cpp.h>

namespace apache {
namespace thrift {


const std::size_t TEnumDataStorage<::cpp2::Metasyntactic>::size;
const std::array<::cpp2::Metasyntactic, 4> TEnumDataStorage<::cpp2::Metasyntactic>::values = {{
  type::FOO,
  type::BAR,
  type::BAZ,
  type::BAX,
}};
const std::array<folly::StringPiece, 4> TEnumDataStorage<::cpp2::Metasyntactic>::names = {{
  "FOO",
  "BAR",
  "BAZ",
  "BAX",
}};



const std::size_t TStructDataStorage<::cpp2::SomeStruct>::fields_size;
const std::array<folly::StringPiece, TStructDataStorage<::cpp2::SomeStruct>::fields_size> TStructDataStorage<::cpp2::SomeStruct>::fields_names = {{
  "reasonable",
  "fine",
  "questionable",
  "tags",
}};
const std::array<int16_t, TStructDataStorage<::cpp2::SomeStruct>::fields_size> TStructDataStorage<::cpp2::SomeStruct>::fields_ids = {{
  1,
  2,
  3,
  4,
}};
const std::array<apache::thrift::protocol::TType, TStructDataStorage<::cpp2::SomeStruct>::fields_size> TStructDataStorage<::cpp2::SomeStruct>::fields_types = {{
  TType::T_I32,
  TType::T_I32,
  TType::T_I32,
  TType::T_SET,
}};

} // namespace thrift
} // namespace apache
