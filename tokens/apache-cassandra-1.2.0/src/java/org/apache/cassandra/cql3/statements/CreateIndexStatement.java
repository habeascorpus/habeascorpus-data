package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
cql3	TokenNameIdentifier
.	TokenNameDOT
statements	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Collections	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
HashMap	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
slf4j	TokenNameIdentifier
.	TokenNameDOT
Logger	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
slf4j	TokenNameIdentifier
.	TokenNameDOT
LoggerFactory	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
auth	TokenNameIdentifier
.	TokenNameDOT
Permission	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
config	TokenNameIdentifier
.	TokenNameDOT
CFMetaData	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
config	TokenNameIdentifier
.	TokenNameDOT
ColumnDefinition	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
exceptions	TokenNameIdentifier
.	TokenNameDOT
ConfigurationException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
cql3	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
.	TokenNameDOT
composites	TokenNameIdentifier
.	TokenNameDOT
CompositesIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
marshal	TokenNameIdentifier
.	TokenNameDOT
CompositeType	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
exceptions	TokenNameIdentifier
.	TokenNameDOT
UnauthorizedException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
service	TokenNameIdentifier
.	TokenNameDOT
ClientState	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
service	TokenNameIdentifier
.	TokenNameDOT
MigrationManager	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
thrift	TokenNameIdentifier
.	TokenNameDOT
IndexType	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
exceptions	TokenNameIdentifier
.	TokenNameDOT
InvalidRequestException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
thrift	TokenNameIdentifier
.	TokenNameDOT
ThriftValidation	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
transport	TokenNameIdentifier
.	TokenNameDOT
messages	TokenNameIdentifier
.	TokenNameDOT
ResultMessage	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
CreateIndexStatement	TokenNameIdentifier
extends	TokenNameextends
SchemaAlteringStatement	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
Logger	TokenNameIdentifier
logger	TokenNameIdentifier
=	TokenNameEQUAL
LoggerFactory	TokenNameIdentifier
.	TokenNameDOT
getLogger	TokenNameIdentifier
(	TokenNameLPAREN
CreateIndexStatement	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
String	TokenNameIdentifier
indexName	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
ColumnIdentifier	TokenNameIdentifier
columnName	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
CreateIndexStatement	TokenNameIdentifier
(	TokenNameLPAREN
CFName	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
indexName	TokenNameIdentifier
,	TokenNameCOMMA
ColumnIdentifier	TokenNameIdentifier
columnName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
indexName	TokenNameIdentifier
=	TokenNameEQUAL
indexName	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
columnName	TokenNameIdentifier
=	TokenNameEQUAL
columnName	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
checkAccess	TokenNameIdentifier
(	TokenNameLPAREN
ClientState	TokenNameIdentifier
state	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
UnauthorizedException	TokenNameIdentifier
,	TokenNameCOMMA
InvalidRequestException	TokenNameIdentifier
{	TokenNameLBRACE
state	TokenNameIdentifier
.	TokenNameDOT
hasColumnFamilyAccess	TokenNameIdentifier
(	TokenNameLPAREN
keyspace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
columnFamily	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
Permission	TokenNameIdentifier
.	TokenNameDOT
ALTER	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
announceMigration	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
InvalidRequestException	TokenNameIdentifier
,	TokenNameCOMMA
ConfigurationException	TokenNameIdentifier
{	TokenNameLBRACE
CFMetaData	TokenNameIdentifier
oldCfm	TokenNameIdentifier
=	TokenNameEQUAL
ThriftValidation	TokenNameIdentifier
.	TokenNameDOT
validateColumnFamily	TokenNameIdentifier
(	TokenNameLPAREN
keyspace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
columnFamily	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
columnExists	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
CFMetaData	TokenNameIdentifier
cfm	TokenNameIdentifier
=	TokenNameEQUAL
oldCfm	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CFDefinition	TokenNameIdentifier
cfDef	TokenNameIdentifier
=	TokenNameEQUAL
oldCfm	TokenNameIdentifier
.	TokenNameDOT
getCfDef	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
ColumnDefinition	TokenNameIdentifier
cd	TokenNameIdentifier
:	TokenNameCOLON
cfm	TokenNameIdentifier
.	TokenNameDOT
getColumn_metadata	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
values	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
cd	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
columnName	TokenNameIdentifier
.	TokenNameDOT
key	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
cd	TokenNameIdentifier
.	TokenNameDOT
getIndexType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
InvalidRequestException	TokenNameIdentifier
(	TokenNameLPAREN
"Index already exists"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
logger	TokenNameIdentifier
.	TokenNameDOT
isDebugEnabled	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
logger	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Updating column {} definition for index {}"	TokenNameStringLiteral
,	TokenNameCOMMA
columnName	TokenNameIdentifier
,	TokenNameCOMMA
indexName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
cd	TokenNameIdentifier
.	TokenNameDOT
getValidator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
isCollection	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
InvalidRequestException	TokenNameIdentifier
(	TokenNameLPAREN
"Indexes on collections are no yet supported"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
cfDef	TokenNameIdentifier
.	TokenNameDOT
isComposite	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
CompositeType	TokenNameIdentifier
composite	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
CompositeType	TokenNameIdentifier
)	TokenNameRPAREN
cfm	TokenNameIdentifier
.	TokenNameDOT
comparator	TokenNameIdentifier
;	TokenNameSEMICOLON
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
>	TokenNameGREATER
opts	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
opts	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
CompositesIndex	TokenNameIdentifier
.	TokenNameDOT
PREFIX_SIZE_OPTION	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
composite	TokenNameIdentifier
.	TokenNameDOT
types	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
(	TokenNameLPAREN
cfDef	TokenNameIdentifier
.	TokenNameDOT
hasCollections	TokenNameIdentifier
?	TokenNameQUESTION
2	TokenNameIntegerLiteral
:	TokenNameCOLON
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cd	TokenNameIdentifier
.	TokenNameDOT
setIndexType	TokenNameIdentifier
(	TokenNameLPAREN
IndexType	TokenNameIdentifier
.	TokenNameDOT
COMPOSITES	TokenNameIdentifier
,	TokenNameCOMMA
opts	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
cd	TokenNameIdentifier
.	TokenNameDOT
setIndexType	TokenNameIdentifier
(	TokenNameLPAREN
IndexType	TokenNameIdentifier
.	TokenNameDOT
KEYS	TokenNameIdentifier
,	TokenNameCOMMA
Collections	TokenNameIdentifier
.	TokenNameDOT
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
>	TokenNameGREATER
emptyMap	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
cd	TokenNameIdentifier
.	TokenNameDOT
setIndexName	TokenNameIdentifier
(	TokenNameLPAREN
indexName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
columnExists	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
columnExists	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
CFDefinition	TokenNameIdentifier
.	TokenNameDOT
Name	TokenNameIdentifier
name	TokenNameIdentifier
=	TokenNameEQUAL
cfDef	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
columnName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
name	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
name	TokenNameIdentifier
.	TokenNameDOT
kind	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
KEY_ALIAS	TokenNameIdentifier
:	TokenNameCOLON
case	TokenNamecase
COLUMN_ALIAS	TokenNameIdentifier
:	TokenNameCOLON
throw	TokenNamethrow
new	TokenNamenew
InvalidRequestException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
"Cannot create index on PRIMARY KEY part %s"	TokenNameStringLiteral
,	TokenNameCOMMA
columnName	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
case	TokenNamecase
VALUE_ALIAS	TokenNameIdentifier
:	TokenNameCOLON
throw	TokenNamethrow
new	TokenNamenew
InvalidRequestException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
"Cannot create index on column %s of compact CF"	TokenNameStringLiteral
,	TokenNameCOMMA
columnName	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
throw	TokenNamethrow
new	TokenNamenew
InvalidRequestException	TokenNameIdentifier
(	TokenNameLPAREN
"No column definition found for column "	TokenNameStringLiteral
+	TokenNamePLUS
columnName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
cfm	TokenNameIdentifier
.	TokenNameDOT
addDefaultIndexNames	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
MigrationManager	TokenNameIdentifier
.	TokenNameDOT
announceColumnFamilyUpdate	TokenNameIdentifier
(	TokenNameLPAREN
cfm	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ResultMessage	TokenNameIdentifier
.	TokenNameDOT
SchemaChange	TokenNameIdentifier
.	TokenNameDOT
Change	TokenNameIdentifier
changeType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
ResultMessage	TokenNameIdentifier
.	TokenNameDOT
SchemaChange	TokenNameIdentifier
.	TokenNameDOT
Change	TokenNameIdentifier
.	TokenNameDOT
UPDATED	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE