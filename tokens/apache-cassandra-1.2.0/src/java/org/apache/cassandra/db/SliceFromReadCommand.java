package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
DataInput	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
DataOutput	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
nio	TokenNameIdentifier
.	TokenNameDOT
ByteBuffer	TokenNameIdentifier
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
db	TokenNameIdentifier
.	TokenNameDOT
filter	TokenNameIdentifier
.	TokenNameDOT
IDiskAtomFilter	TokenNameIdentifier
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
filter	TokenNameIdentifier
.	TokenNameDOT
QueryFilter	TokenNameIdentifier
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
filter	TokenNameIdentifier
.	TokenNameDOT
QueryPath	TokenNameIdentifier
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
filter	TokenNameIdentifier
.	TokenNameDOT
SliceQueryFilter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IVersionedSerializer	TokenNameIdentifier
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
RepairCallback	TokenNameIdentifier
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
StorageService	TokenNameIdentifier
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
ColumnParent	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
ByteBufferUtil	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SliceFromReadCommand	TokenNameIdentifier
extends	TokenNameextends
ReadCommand	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
Logger	TokenNameIdentifier
logger	TokenNameIdentifier
=	TokenNameEQUAL
LoggerFactory	TokenNameIdentifier
.	TokenNameDOT
getLogger	TokenNameIdentifier
(	TokenNameLPAREN
SliceFromReadCommand	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
SliceQueryFilter	TokenNameIdentifier
filter	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SliceFromReadCommand	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
table	TokenNameIdentifier
,	TokenNameCOMMA
ByteBuffer	TokenNameIdentifier
key	TokenNameIdentifier
,	TokenNameCOMMA
ColumnParent	TokenNameIdentifier
column_parent	TokenNameIdentifier
,	TokenNameCOMMA
ByteBuffer	TokenNameIdentifier
start	TokenNameIdentifier
,	TokenNameCOMMA
ByteBuffer	TokenNameIdentifier
finish	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
reversed	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
count	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
table	TokenNameIdentifier
,	TokenNameCOMMA
key	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
QueryPath	TokenNameIdentifier
(	TokenNameLPAREN
column_parent	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
start	TokenNameIdentifier
,	TokenNameCOMMA
finish	TokenNameIdentifier
,	TokenNameCOMMA
reversed	TokenNameIdentifier
,	TokenNameCOMMA
count	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SliceFromReadCommand	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
table	TokenNameIdentifier
,	TokenNameCOMMA
ByteBuffer	TokenNameIdentifier
key	TokenNameIdentifier
,	TokenNameCOMMA
QueryPath	TokenNameIdentifier
path	TokenNameIdentifier
,	TokenNameCOMMA
ByteBuffer	TokenNameIdentifier
start	TokenNameIdentifier
,	TokenNameCOMMA
ByteBuffer	TokenNameIdentifier
finish	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
reversed	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
count	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
table	TokenNameIdentifier
,	TokenNameCOMMA
key	TokenNameIdentifier
,	TokenNameCOMMA
path	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
SliceQueryFilter	TokenNameIdentifier
(	TokenNameLPAREN
start	TokenNameIdentifier
,	TokenNameCOMMA
finish	TokenNameIdentifier
,	TokenNameCOMMA
reversed	TokenNameIdentifier
,	TokenNameCOMMA
count	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
SliceFromReadCommand	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
table	TokenNameIdentifier
,	TokenNameCOMMA
ByteBuffer	TokenNameIdentifier
key	TokenNameIdentifier
,	TokenNameCOMMA
QueryPath	TokenNameIdentifier
path	TokenNameIdentifier
,	TokenNameCOMMA
SliceQueryFilter	TokenNameIdentifier
filter	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
table	TokenNameIdentifier
,	TokenNameCOMMA
key	TokenNameIdentifier
,	TokenNameCOMMA
path	TokenNameIdentifier
,	TokenNameCOMMA
CMD_TYPE_GET_SLICE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
filter	TokenNameIdentifier
=	TokenNameEQUAL
filter	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ReadCommand	TokenNameIdentifier
copy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ReadCommand	TokenNameIdentifier
readCommand	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SliceFromReadCommand	TokenNameIdentifier
(	TokenNameLPAREN
table	TokenNameIdentifier
,	TokenNameCOMMA
key	TokenNameIdentifier
,	TokenNameCOMMA
queryPath	TokenNameIdentifier
,	TokenNameCOMMA
filter	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
readCommand	TokenNameIdentifier
.	TokenNameDOT
setDigestQuery	TokenNameIdentifier
(	TokenNameLPAREN
isDigestQuery	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
readCommand	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Row	TokenNameIdentifier
getRow	TokenNameIdentifier
(	TokenNameLPAREN
Table	TokenNameIdentifier
table	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
DecoratedKey	TokenNameIdentifier
dk	TokenNameIdentifier
=	TokenNameEQUAL
StorageService	TokenNameIdentifier
.	TokenNameDOT
getPartitioner	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
decorateKey	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
table	TokenNameIdentifier
.	TokenNameDOT
getRow	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
QueryFilter	TokenNameIdentifier
(	TokenNameLPAREN
dk	TokenNameIdentifier
,	TokenNameCOMMA
queryPath	TokenNameIdentifier
,	TokenNameCOMMA
filter	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
ReadCommand	TokenNameIdentifier
maybeGenerateRetryCommand	TokenNameIdentifier
(	TokenNameLPAREN
RepairCallback	TokenNameIdentifier
handler	TokenNameIdentifier
,	TokenNameCOMMA
Row	TokenNameIdentifier
row	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
maxLiveColumns	TokenNameIdentifier
=	TokenNameEQUAL
handler	TokenNameIdentifier
.	TokenNameDOT
getMaxLiveCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
count	TokenNameIdentifier
=	TokenNameEQUAL
filter	TokenNameIdentifier
.	TokenNameDOT
count	TokenNameIdentifier
;	TokenNameSEMICOLON
assert	TokenNameassert
maxLiveColumns	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
count	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
maxLiveColumns	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
count	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
int	TokenNameint
liveCountInRow	TokenNameIdentifier
=	TokenNameEQUAL
row	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
row	TokenNameIdentifier
.	TokenNameDOT
cf	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
0	TokenNameIntegerLiteral
:	TokenNameCOLON
filter	TokenNameIdentifier
.	TokenNameDOT
getLiveCount	TokenNameIdentifier
(	TokenNameLPAREN
row	TokenNameIdentifier
.	TokenNameDOT
cf	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
liveCountInRow	TokenNameIdentifier
<	TokenNameLESS
getOriginalRequestedCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
retryCount	TokenNameIdentifier
=	TokenNameEQUAL
liveCountInRow	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
?	TokenNameQUESTION
count	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
:	TokenNameCOLON
(	TokenNameLPAREN
(	TokenNameLPAREN
count	TokenNameIdentifier
*	TokenNameMULTIPLY
count	TokenNameIdentifier
)	TokenNameRPAREN
/	TokenNameDIVIDE
liveCountInRow	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
SliceQueryFilter	TokenNameIdentifier
newFilter	TokenNameIdentifier
=	TokenNameEQUAL
filter	TokenNameIdentifier
.	TokenNameDOT
withUpdatedCount	TokenNameIdentifier
(	TokenNameLPAREN
retryCount	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
RetriedSliceFromReadCommand	TokenNameIdentifier
(	TokenNameLPAREN
table	TokenNameIdentifier
,	TokenNameCOMMA
key	TokenNameIdentifier
,	TokenNameCOMMA
queryPath	TokenNameIdentifier
,	TokenNameCOMMA
newFilter	TokenNameIdentifier
,	TokenNameCOMMA
getOriginalRequestedCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
maybeTrim	TokenNameIdentifier
(	TokenNameLPAREN
Row	TokenNameIdentifier
row	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
row	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
row	TokenNameIdentifier
.	TokenNameDOT
cf	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
;	TokenNameSEMICOLON
filter	TokenNameIdentifier
.	TokenNameDOT
trim	TokenNameIdentifier
(	TokenNameLPAREN
row	TokenNameIdentifier
.	TokenNameDOT
cf	TokenNameIdentifier
,	TokenNameCOMMA
getOriginalRequestedCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
IDiskAtomFilter	TokenNameIdentifier
filter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
filter	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
int	TokenNameint
getOriginalRequestedCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
filter	TokenNameIdentifier
.	TokenNameDOT
count	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"SliceFromReadCommand("	TokenNameStringLiteral
+	TokenNamePLUS
"table='"	TokenNameStringLiteral
+	TokenNamePLUS
table	TokenNameIdentifier
+	TokenNamePLUS
'\''	TokenNameCharacterLiteral
+	TokenNamePLUS
", key='"	TokenNameStringLiteral
+	TokenNamePLUS
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytesToHex	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
'\''	TokenNameCharacterLiteral
+	TokenNamePLUS
", column_parent='"	TokenNameStringLiteral
+	TokenNamePLUS
queryPath	TokenNameIdentifier
+	TokenNamePLUS
'\''	TokenNameCharacterLiteral
+	TokenNamePLUS
", filter='"	TokenNameStringLiteral
+	TokenNamePLUS
filter	TokenNameIdentifier
+	TokenNamePLUS
'\''	TokenNameCharacterLiteral
+	TokenNamePLUS
')'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
class	TokenNameclass
SliceFromReadCommandSerializer	TokenNameIdentifier
implements	TokenNameimplements
IVersionedSerializer	TokenNameIdentifier
<	TokenNameLESS
ReadCommand	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
serialize	TokenNameIdentifier
(	TokenNameLPAREN
ReadCommand	TokenNameIdentifier
rm	TokenNameIdentifier
,	TokenNameCOMMA
DataOutput	TokenNameIdentifier
dos	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
version	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
SliceFromReadCommand	TokenNameIdentifier
realRM	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
SliceFromReadCommand	TokenNameIdentifier
)	TokenNameRPAREN
rm	TokenNameIdentifier
;	TokenNameSEMICOLON
dos	TokenNameIdentifier
.	TokenNameDOT
writeBoolean	TokenNameIdentifier
(	TokenNameLPAREN
realRM	TokenNameIdentifier
.	TokenNameDOT
isDigestQuery	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dos	TokenNameIdentifier
.	TokenNameDOT
writeUTF	TokenNameIdentifier
(	TokenNameLPAREN
realRM	TokenNameIdentifier
.	TokenNameDOT
table	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
writeWithShortLength	TokenNameIdentifier
(	TokenNameLPAREN
realRM	TokenNameIdentifier
.	TokenNameDOT
key	TokenNameIdentifier
,	TokenNameCOMMA
dos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
realRM	TokenNameIdentifier
.	TokenNameDOT
queryPath	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
(	TokenNameLPAREN
dos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SliceQueryFilter	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
(	TokenNameLPAREN
realRM	TokenNameIdentifier
.	TokenNameDOT
filter	TokenNameIdentifier
,	TokenNameCOMMA
dos	TokenNameIdentifier
,	TokenNameCOMMA
version	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ReadCommand	TokenNameIdentifier
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
DataInput	TokenNameIdentifier
dis	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
version	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
boolean	TokenNameboolean
isDigest	TokenNameIdentifier
=	TokenNameEQUAL
dis	TokenNameIdentifier
.	TokenNameDOT
readBoolean	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
table	TokenNameIdentifier
=	TokenNameEQUAL
dis	TokenNameIdentifier
.	TokenNameDOT
readUTF	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ByteBuffer	TokenNameIdentifier
key	TokenNameIdentifier
=	TokenNameEQUAL
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
readWithShortLength	TokenNameIdentifier
(	TokenNameLPAREN
dis	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
QueryPath	TokenNameIdentifier
path	TokenNameIdentifier
=	TokenNameEQUAL
QueryPath	TokenNameIdentifier
.	TokenNameDOT
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
dis	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SliceQueryFilter	TokenNameIdentifier
filter	TokenNameIdentifier
=	TokenNameEQUAL
SliceQueryFilter	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
dis	TokenNameIdentifier
,	TokenNameCOMMA
version	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SliceFromReadCommand	TokenNameIdentifier
rm	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SliceFromReadCommand	TokenNameIdentifier
(	TokenNameLPAREN
table	TokenNameIdentifier
,	TokenNameCOMMA
key	TokenNameIdentifier
,	TokenNameCOMMA
path	TokenNameIdentifier
,	TokenNameCOMMA
filter	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
rm	TokenNameIdentifier
.	TokenNameDOT
setDigestQuery	TokenNameIdentifier
(	TokenNameLPAREN
isDigest	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
rm	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
serializedSize	TokenNameIdentifier
(	TokenNameLPAREN
ReadCommand	TokenNameIdentifier
cmd	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
version	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
TypeSizes	TokenNameIdentifier
sizes	TokenNameIdentifier
=	TokenNameEQUAL
TypeSizes	TokenNameIdentifier
.	TokenNameDOT
NATIVE	TokenNameIdentifier
;	TokenNameSEMICOLON
SliceFromReadCommand	TokenNameIdentifier
command	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
SliceFromReadCommand	TokenNameIdentifier
)	TokenNameRPAREN
cmd	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
keySize	TokenNameIdentifier
=	TokenNameEQUAL
command	TokenNameIdentifier
.	TokenNameDOT
key	TokenNameIdentifier
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
size	TokenNameIdentifier
=	TokenNameEQUAL
sizes	TokenNameIdentifier
.	TokenNameDOT
sizeof	TokenNameIdentifier
(	TokenNameLPAREN
cmd	TokenNameIdentifier
.	TokenNameDOT
isDigestQuery	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
size	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
sizes	TokenNameIdentifier
.	TokenNameDOT
sizeof	TokenNameIdentifier
(	TokenNameLPAREN
command	TokenNameIdentifier
.	TokenNameDOT
table	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
size	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
sizes	TokenNameIdentifier
.	TokenNameDOT
sizeof	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
short	TokenNameshort
)	TokenNameRPAREN
keySize	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
keySize	TokenNameIdentifier
;	TokenNameSEMICOLON
size	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
command	TokenNameIdentifier
.	TokenNameDOT
queryPath	TokenNameIdentifier
.	TokenNameDOT
serializedSize	TokenNameIdentifier
(	TokenNameLPAREN
sizes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
size	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
SliceQueryFilter	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serializedSize	TokenNameIdentifier
(	TokenNameLPAREN
command	TokenNameIdentifier
.	TokenNameDOT
filter	TokenNameIdentifier
,	TokenNameCOMMA
version	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
size	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE