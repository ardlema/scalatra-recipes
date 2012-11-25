package org.ardlema.db


import me.prettyprint.hector.api.factory.HFactory
import me.prettyprint.hector.api.ddl.{KeyspaceDefinition, ComparatorType}
import me.prettyprint.cassandra.service.ThriftKsDef
import java.util
import me.prettyprint.cassandra.serializers.StringSerializer


object CassandraScalaHectorTest {

  def main(args : Array[String]) : Unit = {

    val myCluster = HFactory.getOrCreateCluster("test-cluster", "localhost:9160")

    val keyspaceDef = myCluster.describeKeyspace("MyKeyspace")

    // If keyspace does not exist, the CFs don't exist either. => create them.
    if (keyspaceDef == null) {
      myCluster.addKeyspace(createSchema, true)
    }

    val ksp = HFactory.createKeyspace("MyKeyspace", myCluster)

    val mutator = HFactory.createMutator(ksp, StringSerializer.get())

    mutator.addInsertion("1234", "ColumnFamilyName", HFactory.createStringColumn("name", "alberto"))

    //mutator.addInsertion("1234",HFactory.createStringColumn("name", "alberto"))
    mutator.execute()

 }


  def createSchema: KeyspaceDefinition  = {


    val cfDef = HFactory.createColumnFamilyDefinition("MyKeyspace",
      "ColumnFamilyName",
      ComparatorType.BYTESTYPE);

    val newKeyspace = HFactory.createKeyspaceDefinition("MyKeyspace",
      ThriftKsDef.DEF_STRATEGY_CLASS,
      1,
      util.Arrays.asList(cfDef));

    newKeyspace
  }


}

